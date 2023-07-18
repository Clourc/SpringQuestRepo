package com.wildcodeschool.quest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.quest.Person;

@Controller
public class MainController {
    @GetMapping("/person")
    @ResponseBody
    public Person personSample() {
        return new Person("John Doe", 30);

    }

    @GetMapping("/login")
    public String signIn(){
        return "sign-in.html";
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/movie")
    @ResponseBody
    public String showTitle(@RequestParam String title, @RequestParam(defaultValue = "", required = false) String year){
        if(year.isEmpty()){
            return "The movie's title is " + title;
        }
        return "The movie's title is " + title + ", released in " + year;
    }
}