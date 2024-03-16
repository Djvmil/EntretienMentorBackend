package org.djvmil.em.core.repository;

import org.djvmil.em.core.entity.Response;
import org.djvmil.em.core.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IResponseRepository extends CrudRepository<Response, Long> {}