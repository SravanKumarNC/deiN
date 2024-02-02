package com.dei_survey.survey.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dei_m_employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;
    private String employee_name;
    private String employee_title;
    private String employee_email;
    private Long employee_phone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "add_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "org_id")
    private Organization organization;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dep_id")
    private Department department;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeType_id")
    private EmployeeType employeeType;
}
