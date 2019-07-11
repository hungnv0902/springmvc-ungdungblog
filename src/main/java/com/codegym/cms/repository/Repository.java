package com.codegym.cms.repository;

import java.util.List;

public interface Repository<E> {
    List<E> findAll();

    E findById(Long id);

    void save(E e);

    void remove(Long id);

}
