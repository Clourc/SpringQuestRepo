package com.wildcodeschool.SpringChallenge1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("doctor/1")
    @ResponseBody
    public String getDoctor1(){
        return "<p>William Hartnell</p>";
    }

    @GetMapping("doctor/10")
    @ResponseBody
    public String getDoctor10(){
        return "<p>David Tennent</p>";
    }

    @GetMapping("doctor/13")
    @ResponseBody
    public String getDoctor13(){
        return "<p>Jodie Whittaker</p>";
    }
}