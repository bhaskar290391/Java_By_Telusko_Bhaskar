package com.bhaskar.microservice.quizapp.service;

import com.bhaskar.microservice.quizapp.dao.QuestionDao;
import com.bhaskar.microservice.quizapp.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao repository;


    public ResponseEntity<List<Question>> getAllQuestion() {
        try{
            return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
        }catch (Exception e){
        e.printStackTrace();
        }
        return  new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionByCategory(String category) {

        try{
            return new ResponseEntity<>(repository.findByCategory(category), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<String> addQuestion(Question question) {

        repository.save(question);
        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }
}
