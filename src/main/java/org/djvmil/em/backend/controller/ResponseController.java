package org.djvmil.em.backend.controller;

import jakarta.validation.Valid;
import org.djvmil.em.backend.core.entity.Response;
import org.djvmil.em.backend.core.service.AuthService;
import org.djvmil.em.backend.core.service.InterviewService;
import org.djvmil.em.backend.core.service.QuestionService;
import org.djvmil.em.backend.core.service.ResponseService;
import org.djvmil.em.backend.form.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/response")
public class ResponseController {

    @Autowired
    private ResponseService service;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private AuthService authService;

    @GetMapping
    public String list(Model model){
        Iterable<Response> responses = service.list();
        model.addAttribute("responses", responses);

        return "home";
    }

    //@RequestMapping("/{id}")
    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long responseId, Model model){
        Response response = service.findById(responseId);
        model.addAttribute("response", response);

        return "user-detail";
    }

    @GetMapping("add")
    public String addUser(@ModelAttribute UserForm user){

        return "add-user";
    }

    @PostMapping
    public String addResponse(@Valid @ModelAttribute UserForm userAtt, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors())
            return "add-user";

        Response response = new Response();


        response.setResponseID(123L);
        response.setResponseText(userAtt.getFirstname());
        response.setScore(12L);

        model.addAttribute("user", userAtt);

        service.save(response);

        return "result-add-user";
    }

}
