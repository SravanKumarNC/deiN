package com.dei_survey.survey.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dei_m_city")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long city_id;
    private String city_name;
}
