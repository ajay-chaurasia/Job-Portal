package com.jobportal.jobportal.controller;

import com.jobportal.jobportal.model.Job;
import com.jobportal.jobportal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("alljobs")
    public String getAllJobs(Model model) {
        List<Job> jobs = jobService.getAllJobs();
        model.addAttribute("jobPosts", jobs);
        return "alljobs";
    }

    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String addJob(Model model, Job job) {
        model.addAttribute("jobPost", job);
        jobService.addJob(job);
        return "success";
    }

    @GetMapping("load")
    public String loadData() {
        jobService.load();
        return "Successfully Loaded";
    }
}
