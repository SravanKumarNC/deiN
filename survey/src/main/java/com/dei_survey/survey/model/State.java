package com.dei_survey.survey.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dei_m_state")
@Data
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long state_id;
    private String state_name;
}
