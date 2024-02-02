package com.dei_survey.survey.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dei_m_country")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long country_id;
    private String country_name;
}
