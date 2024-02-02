package com.dei_survey.survey.controllers;

import com.dei_survey.survey.model.Question;
import com.dei_survey.survey.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping
    public ResponseEntity<?> createQuestion(@RequestBody Question question){
        questionService.createQuestion(question);
        return ResponseEntity.ok(question);
    }
}
