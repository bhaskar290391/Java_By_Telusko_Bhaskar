package com.bhaskar.microservice.quizservice.controller;


import com.bhaskar.microservice.quizservice.dto.QuizDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bhaskar.microservice.quizservice.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    private QuizService service;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDTO quizDTO)
    {
        return  service.createQuiz(quizDTO.getCategory(),quizDTO.getNumQ(),quizDTO.getTitle());
    }

    /*
    @GetMapping("/get/{quizId}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(@PathVariable int quizId){
        return service.getQuizQuestions(quizId);
    }

    @PostMapping("/calculateResult/{quizId}")
    public ResponseEntity<Integer> calculateQuizResult(@PathVariable int quizId, @RequestBody List<QuestionResponse> response){
        return  service.calculteQuizResult(quizId,response);
    }

*/
}
