package com.microservice.question.controller;


import com.microservice.question.entity.Question;
import com.microservice.question.model.QuestionResponse;
import com.microservice.question.model.QuestionWrapper;
import com.microservice.question.service.QuestionService;
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

    //generate QuestionForQuiz
    @GetMapping("/generateQuestionForQuiz")
    public ResponseEntity<List<Integer>> generateQuestionForQuiz(@RequestParam String category,@RequestParam int numQuestions){
       return  service.generateQuestionForQuiz(category,numQuestions);
    }

    //getQuestionsByIds
    @PostMapping("/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<Integer> ids){
        return  service.getQuestionsFromListOfIds(ids);
    }
    //calculateScores

    @PostMapping("calculateScores")
    public ResponseEntity<Integer> calculateScores(@RequestBody List<QuestionResponse> responses){
       return service.calculateScores(responses);
    }


}
