package org.djvmil.em.core.service;

import org.djvmil.em.core.entity.Question;
import org.djvmil.em.core.entity.Response;
import org.djvmil.em.core.repository.IResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResponseService {
    @Autowired
    private IResponseRepository repository;

    @Transactional
    public Response save(Response response){
        return repository.save(response);
    }

    public Iterable<Response> list(){
        return repository.findAll();
    }

    public Response findById(Long responseId) {
        return repository.findById(responseId).orElseThrow();
    }
}
