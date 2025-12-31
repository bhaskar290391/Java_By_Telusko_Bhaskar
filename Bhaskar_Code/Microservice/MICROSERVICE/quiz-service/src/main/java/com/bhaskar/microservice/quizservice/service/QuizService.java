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


    /*

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int quizId) {
//
//      Quiz  quiz =quizRepository.findById(quizId).get();
//      List<Question> questions=quiz.getQuestions();
//
//     List<QuestionWrapper> data= questions.stream().map( q ->{
//          QuestionWrapper questionWrapper = new QuestionWrapper(q.getId(), q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
//          return  questionWrapper;
//      }).toList();
//
//     return new ResponseEntity<>(data,HttpStatus.OK);

        return new ResponseEntity<>(null,HttpStatus.OK);

    }

    public ResponseEntity<Integer> calculteQuizResult(int quizId, List<QuestionResponse> response) {

//        Quiz  quiz =quizRepository.findById(quizId).get();
//        List<Question> questions=quiz.getQuestions();
//        int right=0;
//        int i=0;
//        for(QuestionResponse q: response){
//            if(q.getResponse().equals(questions.get(i).getRightAnswer())){
//                right++;
//            }
//            i++;
//        }
//        return  new ResponseEntity<>(right,HttpStatus.OK);

        return new ResponseEntity<>(0,HttpStatus.OK);
    }


     */
}
