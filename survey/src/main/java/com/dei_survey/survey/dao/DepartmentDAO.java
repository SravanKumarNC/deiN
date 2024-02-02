package com.dei_survey.survey.dao;

import com.dei_survey.survey.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDAO extends JpaRepository<Department, Long> {
}
