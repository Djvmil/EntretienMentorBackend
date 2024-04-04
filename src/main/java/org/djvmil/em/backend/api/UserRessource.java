package org.djvmil.em.backend.api;

import org.djvmil.em.backend.core.dto.UserDto;
import org.djvmil.em.backend.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserRessource {

    @Autowired // like @Inject or @Ressource in JEE
    private UserService service;

   /* @PostMapping("/login")
    public UserDto login(@RequestBody UserDto userDto){

        return service.login(userDto.getUsername(), userDto.getPassword());
    }*/

    @PostMapping
    public UserDto create(@RequestBody UserDto userDto){

        return service.create(userDto);
    }

    @GetMapping
    public Iterable<UserDto> getUsers(){

        return service.allUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable("id") Long userId){

        return service.getById(userId);
    }

}
