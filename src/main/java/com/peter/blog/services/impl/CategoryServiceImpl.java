package com.peter.blog.services.impl;

import com.peter.blog.domain.entities.Category;
import com.peter.blog.repositories.CategoryRepository;
import com.peter.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAll();
    }
}
