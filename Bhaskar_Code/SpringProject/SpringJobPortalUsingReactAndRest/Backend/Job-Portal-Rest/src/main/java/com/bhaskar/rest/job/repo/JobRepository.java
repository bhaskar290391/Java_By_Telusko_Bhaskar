package com.bhaskar.rest.job.repo;

import com.bhaskar.rest.job.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword, String keyword1);
}


/*
public void addJobs(JobPost post){
        jobs.add(post);
        System.out.println(jobs);
    }

    public List<JobPost> getJobsPosts(){

        return jobs;
    }

    public JobPost getJobsPost(int postId) {
        return  jobs.stream().filter(job-> job.getPostId()==postId).findFirst().orElse(null);
    }

    public void updateJobPost(JobPost jobPost) {

        jobs=jobs.stream()
                .map( data -> {
                    if(data.getPostId() == jobPost.getPostId()){
                        data.setPostDesc(jobPost.getPostDesc());
                        data.setPostProfile(jobPost.getPostProfile());
                        data.setReqExperience(jobPost.getReqExperience());
                        data.setPostTechStack(jobPost.getPostTechStack());
                    }
                    return data;
                }).toList();
    }

    public void deleteJobPost(int postId) {
        jobs.removeIf(c->c.getPostId() ==postId);
    }
 */
