package com.bhaskar.microservice.quizservice.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class QuestionResponse {

    private int id;
    private String response;
}
