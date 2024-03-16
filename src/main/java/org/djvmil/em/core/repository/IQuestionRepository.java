package org.djvmil.em.core.repository;

import org.djvmil.em.core.entity.Question;
import org.djvmil.em.core.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IQuestionRepository extends CrudRepository<Question, Long> {}