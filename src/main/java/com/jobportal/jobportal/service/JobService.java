package com.jobportal.jobportal.service;

import com.jobportal.jobportal.model.Job;
import com.jobportal.jobportal.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;

    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public void addJob(Job job) {
        jobRepo.save(job);
    }

    public void load() {
        List<Job> jobs =
                new ArrayList<>(List.of(
                        new Job(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL","API")),
                        new Job(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow","API")),
                        new Job(3, "Frontend Developer", "Create API amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS","API")),
                        new Job(4, "Network Engineer", "Design and API maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
                        new Job(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))

                ));
        jobRepo.saveAll(jobs);
    }
}
