package com.bhaskar.microservice.quizservice.entity;

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

    //@ManyToMany
    @ElementCollection
    private List<Integer> questions;

}
