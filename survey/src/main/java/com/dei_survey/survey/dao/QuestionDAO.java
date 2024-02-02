package com.dei_survey.survey.dao;

import com.dei_survey.survey.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface QuestionDAO extends JpaRepository<Question, Long> {
}
