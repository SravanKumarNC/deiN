package com.dei_survey.survey.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "dei_m_organization")
@Data
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long org_id;
    private String org_code;
    private String organizationName;
    private String org_description;
    private LocalDateTime update_timestamp = LocalDateTime.now();
}
