package com.bhaskar.microservice.quizservice.feign;

import com.bhaskar.microservice.quizservice.model.QuestionResponse;
import com.bhaskar.microservice.quizservice.model.QuestionWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {

    //generate QuestionForQuiz
    @GetMapping("question/generateQuestionForQuiz")
    public ResponseEntity<List<Integer>> generateQuestionForQuiz(@RequestParam String category, @RequestParam int numQuestions);

    //getQuestionsByIds
    @PostMapping("question/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<Integer> ids);
    //calculateScores

    @PostMapping("question/calculateScores")
    public ResponseEntity<Integer> calculateScores(@RequestBody List<QuestionResponse> responses);

}
