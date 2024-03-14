package org.djvmil.em.core.repository;

import org.djvmil.em.core.entity.User;

import java.util.List;

public interface IAuthentificationRepository/*  extends CrudRepository<User, Long> */{

    public User login(String login, String password);

    public User register(User user);

    public List<User> list();

    User getById(Long userId);
}
