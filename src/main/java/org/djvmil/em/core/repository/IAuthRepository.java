package org.djvmil.em.core.repository;

import org.djvmil.em.core.entity.User;
import org.springframework.data.repository.CrudRepository;

//public interface IAuthRepository extends PagingAndSortingRepository {
//public interface IAuthRepository extends Repository {

//OpenSession in View(Hibernate)
//OpenEntityManager in View(JPA)
public interface IAuthRepository extends CrudRepository<User, Long> {
/*
    public User login(String login, String password);

    public User register(User user);

    public List<User> list();

    User getById(Long userId);*/
}
