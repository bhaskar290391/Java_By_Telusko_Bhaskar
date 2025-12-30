package com.bhaskar.microservice.quizapp.service;

import com.bhaskar.microservice.quizapp.dao.QuestionDao;
import com.bhaskar.microservice.quizapp.dao.QuizRepository;
import com.bhaskar.microservice.quizapp.entity.Question;
import com.bhaskar.microservice.quizapp.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository repository ;

    @Autowired
    private QuestionDao questionDao ;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title)
    {
        List<Question> question=questionDao.findByRandomQuestionBycategory(category,numQ);
        Quiz quiz= new Quiz();
        quiz.setQuizName("Java");
        quiz.setQuestions(question);
        repository.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
