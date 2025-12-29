package com.bhaskar.job;

import com.bhaskar.job.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;

    public List<JobPost> getAllJobs(){
        return  repository.getJobsPost();
    }

    public void addJob(JobPost jobPost){
        repository.addJobs(jobPost);
    }

}
