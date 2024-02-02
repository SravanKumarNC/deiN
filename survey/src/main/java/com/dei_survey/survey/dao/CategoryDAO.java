package com.dei_survey.survey.dao;

import com.dei_survey.survey.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface CategoryDAO extends JpaRepository<Category, Long> {

    Category findByCategoryName( String categoryName);
}
