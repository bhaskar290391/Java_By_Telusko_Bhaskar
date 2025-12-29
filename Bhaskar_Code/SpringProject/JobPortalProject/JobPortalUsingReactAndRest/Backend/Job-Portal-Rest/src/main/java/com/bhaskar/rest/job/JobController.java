package com.bhaskar.rest.job;

import com.bhaskar.rest.job.model.JobPost;
import com.bhaskar.rest.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getJobPosts(){
        return  service.getAllJobs();
    }

    @GetMapping("/post/{postId}")
    public JobPost getJobPost(@PathVariable("postId") int postId){

        return service.getJobPost(postId);
    }
}
