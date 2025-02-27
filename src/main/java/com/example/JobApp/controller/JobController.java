package com.example.JobApp.controller;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
//    @RequestMapping({"/","home"})
    @GetMapping({"/","home"})
    public  String home() {
        return "home";
    }

//    @RequestMapping("addjob")
    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

//    @RequestMapping("handleForm")
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        System.out.println(jobPost);
        return "success";
    }

}
