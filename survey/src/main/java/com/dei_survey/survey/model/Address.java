package com.dei_survey.survey.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dei_m_address")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long add_id;
    private String add_name;
    private String street;
    private Long zipcode;
    private Long phone;
    private String email;
    private String url;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToOne(mappedBy = "address")
    private Employee employee;

}
