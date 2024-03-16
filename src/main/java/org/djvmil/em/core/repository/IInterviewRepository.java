package org.djvmil.em.core.repository;

import org.djvmil.em.core.entity.Interview;
import org.djvmil.em.core.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface IInterviewRepository extends CrudRepository<Interview, Long> {}
