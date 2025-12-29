package com.bhaskar.rest.job;

import com.bhaskar.rest.job.model.JobPost;
import com.bhaskar.rest.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/jobPost/{postId}")
    public JobPost getJobPost(@PathVariable("postId") int postId){
        return service.getJobPost(postId);
    }

    @PostMapping("/jobPost")
    public JobPost addJobPost(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return  service.getJobPost(jobPost.getPostId());
    }

    @PutMapping("/jobPost")
    public JobPost updateJobPost(@RequestBody JobPost jobPost){
        service.updateJobPost(jobPost);
        return  service.getJobPost(jobPost.getPostId());
    }

    @DeleteMapping("/jobPost/{postId}")
    public String deletePost(@PathVariable("postId") int postId){
        service.deleteJobPost(postId);
        return "Deleted";
    }

}
