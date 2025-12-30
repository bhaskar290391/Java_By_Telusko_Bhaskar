package com.bhaskar.microservice.quizapp.service;

import com.bhaskar.microservice.quizapp.dao.QuestionDao;
import com.bhaskar.microservice.quizapp.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao repository;


    public List<Question> getAllQuestion() {
        return  repository.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return  repository.findByCategory(category);
    }

    public String addQuestion(Question question) {
        repository.save(question);
        return  "success";
    }
}
