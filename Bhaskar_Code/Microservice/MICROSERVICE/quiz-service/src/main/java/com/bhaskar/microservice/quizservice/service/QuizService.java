package com.bhaskar.microservice.quizservice.service;


import com.bhaskar.microservice.quizservice.dao.QuizRepository;
import com.bhaskar.microservice.quizservice.entity.Quiz;
import com.bhaskar.microservice.quizservice.feign.QuizInterface;
import com.bhaskar.microservice.quizservice.model.QuestionResponse;
import com.bhaskar.microservice.quizservice.model.QuestionWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository ;

    @Autowired
    private QuizInterface clientService;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title)
    {
        List<Integer> Ids=new ArrayList<>();
        Ids=clientService.generateQuestionForQuiz(category,numQ).getBody();
        Quiz quiz= new Quiz();
        quiz.setQuizName(title);
        quiz.setQuestions(Ids);
        quizRepository.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }



    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int quizId) {

      Quiz  quiz =quizRepository.findById(quizId).get();
      List<Integer> questionIds=quiz.getQuestions();
       ResponseEntity<List<QuestionWrapper>> data=clientService.getQuestions(questionIds);
       return data;
    }

    public ResponseEntity<Integer> calculteQuizResult(int quizId, List<QuestionResponse> response) {
        ResponseEntity<Integer> data =clientService.calculateScores(response);
        return data;
    }



}
