package org.djvmil.em.core.service;

import org.djvmil.em.core.entity.Interview;
import org.djvmil.em.core.entity.User;
import org.djvmil.em.core.repository.IInterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewService {
    @Autowired
    private IInterviewRepository repository;

    public Interview save(Interview interview){

        return repository.save(interview);
    }

    public Iterable<Interview> list(){
        return repository.findAll();
    }

    public Interview findById(Long interviewId) {
        return repository.findById(interviewId).orElseThrow();
    }
}
