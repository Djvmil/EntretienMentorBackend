package org.djvmil.em.core.service;

import org.djvmil.em.core.entity.User;
import org.djvmil.em.core.repository.IAuthentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
public class AuthentificationService {
    @Autowired // like @Inject or @Ressource in JEE
    private IAuthentificationRepository repository;

    public User login(String login, String password){
        return repository.findById(1L).orElseThrow();
    }

    public User register(User user){

        return repository.save(user);
    }

    public Iterable<User> list(){
        return repository.findAll();
    }

    public User getById(Long userId) {
        return repository.findById(userId).orElseThrow();
    }
}
