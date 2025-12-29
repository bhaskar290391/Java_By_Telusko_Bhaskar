package com.bhaskar.rest.job;

import com.bhaskar.rest.job.model.JobPost;
import com.bhaskar.rest.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("jobPost")
    public List<JobPost> getJobPost(){
        return  service.getAllJobs();
    }
}
