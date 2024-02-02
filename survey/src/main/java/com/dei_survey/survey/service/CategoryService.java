package com.dei_survey.survey.service;

import com.dei_survey.survey.model.Category;

import java.util.List;

public interface CategoryService {

    public Category createCategory(Category category);

    public Category getCategoryById(Long id);

    public List<Category> getAllCategories();

    public Category deleteCategory(Long id);
}
