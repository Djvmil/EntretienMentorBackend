package org.djvmil.em.backend.api;

import org.djvmil.em.backend.core.dto.UserDto;
import org.djvmil.em.backend.core.entity.User;
import org.djvmil.em.backend.core.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserRessource {

    @Autowired // like @Inject or @Ressource in JEE
    private AuthService service;

    @PostMapping
    public UserDto create(@RequestBody UserDto userDto){

        return service.register(userDto);
    }

    @GetMapping
    public Iterable<UserDto> getUsers(){

        return service.list();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable("id") Long userId){

        return service.getById(userId);
    }

}
