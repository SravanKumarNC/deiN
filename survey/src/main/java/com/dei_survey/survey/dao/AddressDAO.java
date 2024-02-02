package com.dei_survey.survey.dao;

import com.dei_survey.survey.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDAO extends JpaRepository<Address, Long> {
}
