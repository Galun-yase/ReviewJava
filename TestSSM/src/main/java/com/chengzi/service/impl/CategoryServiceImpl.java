package com.chengzi.service.impl;

import com.chengzi.entity.Categroy;
import com.chengzi.repository.CategroyRepository;
import com.chengzi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategroyRepository categroyRepository;

    @Override
    public List<Categroy> findAll() {
        return categroyRepository.findAll();
    }
}
