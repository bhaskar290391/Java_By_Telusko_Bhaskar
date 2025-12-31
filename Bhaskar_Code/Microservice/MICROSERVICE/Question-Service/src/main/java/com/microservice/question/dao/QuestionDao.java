package com.microservice.question.dao;


import com.microservice.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{

    List<Question> findByCategory(String category);

    @Query(value = "select id from question where category= :category order by Random() LIMIT :numQ",nativeQuery = true)
    List<Integer> findByRandomQuestionBycategory(String category, int numQ);
}
