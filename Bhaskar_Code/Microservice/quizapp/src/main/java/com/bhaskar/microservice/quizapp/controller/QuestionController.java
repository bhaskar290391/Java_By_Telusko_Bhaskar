package com.bhaskar.microservice.quizapp.controller;

import com.bhaskar.microservice.quizapp.entity.Question;
import com.bhaskar.microservice.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService service;

   @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestion(){
        return service.getAllQuestion();
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return service.getQuestionByCategory(category);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return service.addQuestion(question);

    }
}
