package com.dei_survey.survey.dao;

import com.dei_survey.survey.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {
}
