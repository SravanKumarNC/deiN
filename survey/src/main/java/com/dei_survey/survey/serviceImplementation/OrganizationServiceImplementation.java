package com.dei_survey.survey.serviceImplementation;

import com.dei_survey.survey.dao.OrganizationDAO;
import com.dei_survey.survey.model.Organization;
import com.dei_survey.survey.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImplementation implements OrganizationService {

    @Autowired
    OrganizationDAO organizationDAO;

    @Override
    public Organization createOrganization(Organization organization) {
        organizationDAO.save(organization);
        return organization;
    }

    @Override
    public Organization getOrganizationById(Long id) {
        Organization organization = organizationDAO.findById(id).orElse(null);
        return organization;
    }

    @Override
    public List<Organization> getAllOrganizations() {
        List<Organization> organizations = organizationDAO.findAll();
        return organizations;
    }

    @Override
    public Organization deleteOrganization(Long id) {
        Organization organization = organizationDAO.findById(id).orElse(null);
        organizationDAO.delete(organization);
        return organization;
    }
}
