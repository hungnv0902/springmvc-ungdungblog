package com.codegym.cms.service;

import java.util.List;

public interface BlogService<E> {
    List<E> findAll();

    E findById(Long id);

    void save(E blog);

    void remove(Long id);
}
