package com.bhaskar.rest.job.service;


import com.bhaskar.rest.job.model.JobPost;
import com.bhaskar.rest.job.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;

    public List<JobPost> getAllJobs(){
        return  repository.findAll();
    }

    public void addJob(JobPost jobPost){
        System.out.println("Added");
        repository.save(jobPost);

    }

    public JobPost getJobPost(int postId) {
        return  repository.findById(postId).get();
    }

    public void updateJobPost(JobPost jobPost) {
        repository.save(jobPost);
    }

    public void deleteJobPost(int postId) {
        repository.deleteById(postId);
    }

    public void load(){
        // ArrayList to store JobPost objects
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(

                new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                        List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                        List.of("HTML", "CSS", "JavaScript", "React")),


                new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                        List.of("Python", "Machine Learning", "Data Analysis")),


                new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                        List.of("Networking", "Cisco", "Routing", "Switching")),


                new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                        List.of("iOS Development", "Android Development", "Mobile App"))
        ));

        repository.saveAll(jobs);
    }

    public List<JobPost> searchKeyWord(String keyword) {

        return  repository.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
