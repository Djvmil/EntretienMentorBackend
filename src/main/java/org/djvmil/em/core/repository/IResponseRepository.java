package org.djvmil.em.core.repository;

import org.djvmil.em.core.entity.Response;
import org.djvmil.em.core.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IResponseRepository extends CrudRepository<Response, Long> {
    @Query("SELECT response from Response response inner join fetch response.user" +
            " inner join fetch response.interview" +
            " inner join fetch response.question")
    Iterable<Response> findAll();
}