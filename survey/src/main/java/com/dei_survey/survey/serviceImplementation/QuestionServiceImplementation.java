package com.dei_survey.survey.serviceImplementation;

import com.dei_survey.survey.dao.CategoryDAO;
import com.dei_survey.survey.dao.OrganizationDAO;
import com.dei_survey.survey.dao.QuestionDAO;
import com.dei_survey.survey.model.Category;
import com.dei_survey.survey.model.Organization;
import com.dei_survey.survey.model.Question;
import com.dei_survey.survey.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImplementation implements QuestionService {

    @Autowired
    QuestionDAO questionDAO;
    @Autowired
    OrganizationDAO organizationDAO;
    @Autowired
    CategoryDAO categoryDAO;

    @Override
    public Question createQuestion(Question question) {
        Organization organization = question.getOrganization();
        Category category = question.getCategory();

        if(organization != null && organization.getOrganizationName() != null){
            organization = organizationDAO.findByOrganizationName(organization.getOrganizationName());
        }else{
            organization =organizationDAO.save(question.getOrganization());
        }

        if(category != null && category.getCategoryName() != null){
            category = categoryDAO.findByCategoryName(category.getCategoryName());
        }else{
            category = categoryDAO.save(question.getCategory());
        }

        question.setCategory(category);
        question.setOrganization(organization);

        questionDAO.save(question);
        return question;
    }
}
