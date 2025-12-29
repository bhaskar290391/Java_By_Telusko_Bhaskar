package com.bhaskar.job.controllers;

import com.bhaskar.job.JobService;
import com.bhaskar.job.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }


    @GetMapping({"addjob"})
    public String addjob(){
        return "addjob";
    }


    @PostMapping("handleForm")
    public String handleForm(JobPost post){
        service.addJob(post);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model){
        model.addAttribute("jobPosts",service.getAllJobs());

        return "viewalljobs";
    }
}
