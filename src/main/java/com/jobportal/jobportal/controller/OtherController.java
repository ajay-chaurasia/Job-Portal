package com.jobportal.jobportal.controller;

import com.jobportal.jobportal.model.Job;
import com.jobportal.jobportal.service.JobService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OtherController {

    @Autowired
    private JobService jobService;

    @GetMapping("getAllJobsData")
    public List<Job> getAllJobsData(){
        return jobService.getAllJobs();
    }

    @PostMapping("addOneJob")
    public void addOneJob(@RequestBody Job job) {
        jobService.addJob(job);
    }

    @GetMapping("csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
