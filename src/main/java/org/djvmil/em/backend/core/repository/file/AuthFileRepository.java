package org.djvmil.em.backend.core.repository.file;


import org.djvmil.em.backend.core.entity.User;
import org.djvmil.em.backend.core.repository.IAuthRepository;

import java.util.Optional;

public class AuthFileRepository implements IAuthRepository {

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Iterable<User> findUserByFirstname(String firstname) {
        return null;
    }

    @Override
    public Iterable<User> findUserByLastname(String lastname) {
        return null;
    }

    @Override
    public Iterable<User> findUserByGenre(String genre) {
        return null;
    }

    @Override
    public Iterable<User> findUserByRole(String role) {
        return null;
    }
}
