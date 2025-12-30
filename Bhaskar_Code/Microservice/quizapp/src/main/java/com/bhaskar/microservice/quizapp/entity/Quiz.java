package com.bhaskar.microservice.quizapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer quizId;
    private String quizName;

    @ManyToMany
    private List<Question> questions;

}
