package com.bhaskar.microservice.quizservice.dto;

import lombok.Data;

@Data
public class QuizDTO {
    private String title;
    private String category;
    private int numQ;
}
