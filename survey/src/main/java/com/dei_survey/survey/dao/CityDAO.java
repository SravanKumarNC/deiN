package com.dei_survey.survey.dao;

import com.dei_survey.survey.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDAO extends JpaRepository<City, Long> {
}
