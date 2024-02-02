package com.dei_survey.survey.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dei_m_employeeType")
public class EmployeeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeType_id;
    private String employeeType_name;
}
