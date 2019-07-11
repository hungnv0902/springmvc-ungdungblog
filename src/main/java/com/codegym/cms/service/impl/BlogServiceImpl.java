package com.codegym.cms.service.impl;

import com.codegym.cms.model.Blog;
import com.codegym.cms.repository.BlogRepository;
import com.codegym.cms.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService<Blog> {

    @Autowired
    private BlogRepository customerRepository;
    @Override
    public List<Blog> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        customerRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
