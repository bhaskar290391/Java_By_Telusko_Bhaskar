package com.bhaskar.job.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {

    private int postId;
    private String postProfile;
    private String postDesc ;
    private String reqExperience;
    private List<String> PostTechStack;
}
