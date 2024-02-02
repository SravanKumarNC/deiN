package com.dei_survey.survey.dao;

import com.dei_survey.survey.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDAO extends JpaRepository<Country, Long> {
}
