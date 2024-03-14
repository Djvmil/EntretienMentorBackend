package org.djvmil.em.core.repository;

import org.djvmil.em.core.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

//public interface IAuthentificationRepositoryc extends PagingAndSortingRepository {
//public interface IAuthentificationRepositoryc extends Repository {
public interface IAuthentificationRepository extends CrudRepository<User, Long> {
/*
    public User login(String login, String password);

    public User register(User user);

    public List<User> list();

    User getById(Long userId);*/
}
