package com.qiyao.shortenservice.dao;

import com.qiyao.shortenservice.model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @ClassName TestDao
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@Component
public class TestDao implements CrudRepository<Test, Long> {
    @Override
    public <S extends Test> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Test> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Test> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Test> findAll() {
        return null;
    }

    @Override
    public Iterable<Test> findAllById(Iterable<Long> longs) {
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
    public void delete(Test entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Test> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
