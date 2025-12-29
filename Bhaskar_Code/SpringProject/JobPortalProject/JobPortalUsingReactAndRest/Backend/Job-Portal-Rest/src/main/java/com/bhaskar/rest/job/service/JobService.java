package com.bhaskar.rest.job.service;


import com.bhaskar.rest.job.model.JobPost;
import com.bhaskar.rest.job.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;

    public List<JobPost> getAllJobs(){
        return  repository.getJobsPosts();
    }

    public void addJob(JobPost jobPost){
        repository.addJobs(jobPost);
    }

    public JobPost getJobPost(int postId) {
        return  repository.getJobsPost(postId);
    }
}
