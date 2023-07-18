package com.wildcodeschool.questContent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model){
        String name = "Bernard";
        model.addAttribute("name", name);
        return "home.html";
    }
}