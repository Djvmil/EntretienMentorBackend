package org.djvmil.em.repository.db;

import org.djvmil.em.entity.User;
import org.djvmil.em.repository.IAuthentificationRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//@Component
public class AuthentificationDBRepository implements IAuthentificationRepository {

    @Override
    public User login(String login, String password){
        User user = new User();

        return user;
    }

    @Override
    public Boolean register(User user){

        return true;
    }

    @Override
    public List<User> list() {
        return null;
    }
}
