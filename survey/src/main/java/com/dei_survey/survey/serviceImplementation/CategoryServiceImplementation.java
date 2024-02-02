package com.dei_survey.survey.serviceImplementation;

import com.dei_survey.survey.dao.CategoryDAO;
import com.dei_survey.survey.model.Category;
import com.dei_survey.survey.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImplementation implements CategoryService {

    @Autowired
    CategoryDAO categoryDAO;

    @Override
    public Category createCategory(Category category) {
        categoryDAO.save(category);
        return category;
    }

    @Override
    public Category getCategoryById(Long id) {

        Category category = categoryDAO.findById(id).orElse(null);
        return category;
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = categoryDAO.findAll();
        return categories;
    }

    @Override
    public Category deleteCategory(Long id) {
        Category category = categoryDAO.findById(id).orElse(null);
        categoryDAO.delete(category);
        return category;
    }
}
