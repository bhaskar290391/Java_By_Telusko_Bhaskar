package com.microservice.question.service;


import com.microservice.question.dao.QuestionDao;
import com.microservice.question.entity.Question;
import com.microservice.question.model.QuestionResponse;
import com.microservice.question.model.QuestionWrapper;
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

    public ResponseEntity<List<Integer>> generateQuestionForQuiz(String category, int numQuestions) {
        List<Integer> data=repository.findByRandomQuestionBycategory(category,numQuestions);
        return new ResponseEntity<>(data,HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromListOfIds(List<Integer> ids) {

        List<Question> questions= new ArrayList<>();
        for(Integer id :ids){
           questions.add(repository.findById(id).get());
        }

        List<QuestionWrapper> data= questions.stream().map( q ->{
            QuestionWrapper questionWrapper = new QuestionWrapper(q.getId(), q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
            return  questionWrapper;
        }).toList();

        return new ResponseEntity<>(data,HttpStatus.OK);
    }


    public ResponseEntity<Integer> calculateScores(List<QuestionResponse> responses) {
        int right=0;
        for(QuestionResponse response:responses){
            Question  question =repository.findById(response.getId()).get();




                if(response.getResponse().equals(question.getRightAnswer())){
                    right++;
                }

        }
        return  new ResponseEntity<>(right,HttpStatus.OK);
    }
}
