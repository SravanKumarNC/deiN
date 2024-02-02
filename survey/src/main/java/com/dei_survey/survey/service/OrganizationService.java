package com.dei_survey.survey.service;

import com.dei_survey.survey.model.Organization;

import java.util.List;

public interface OrganizationService {

    public Organization createOrganization(Organization organization);

    public Organization getOrganizationById(Long id);

    public List<Organization> getAllOrganizations();

    public Organization deleteOrganization(Long id);
}
