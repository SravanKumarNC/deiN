package com.dei_survey.survey.controllers;

import com.dei_survey.survey.model.Organization;
import com.dei_survey.survey.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @PostMapping()
    public ResponseEntity<?> createOrganization(@RequestBody Organization organization){
        organizationService.createOrganization(organization);
        return ResponseEntity.ok(organization);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrganizationById(@PathVariable Long id){
        Organization organization = organizationService.getOrganizationById(id);
        return ResponseEntity.ok(organization);
    }

    @GetMapping()
    public ResponseEntity<?> getAllOrganizations(){
        List<Organization> organizations = organizationService.getAllOrganizations();
        return ResponseEntity.ok(organizations);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrganization(@PathVariable Long id){
        Organization organization = organizationService.deleteOrganization(id);
        return ResponseEntity.ok(organization);
    }

}
