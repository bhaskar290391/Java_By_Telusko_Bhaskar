package com.bhaskar.microservice.quizapp.controller;

import com.bhaskar.microservice.quizapp.model.QuestionResponse;
import com.bhaskar.microservice.quizapp.model.QuestionWrapper;
import com.bhaskar.microservice.quizapp.service.QuizService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    private QuizService service;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,
                                             @RequestParam int numQ,
                                             @RequestParam String title){
        return  service.createQuiz(category,numQ,title);
    }

    @GetMapping("/get/{quizId}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable int quizId){
        return service.getQuizQuestions(quizId);
    }

    @PostMapping("/calculateResult/{quizId}")
    public ResponseEntity<Integer> calculateQuizResult(@PathVariable int quizId, @RequestBody List<QuestionResponse> response){
        return  service.calculteQuizResult(quizId,response);
    }


}
