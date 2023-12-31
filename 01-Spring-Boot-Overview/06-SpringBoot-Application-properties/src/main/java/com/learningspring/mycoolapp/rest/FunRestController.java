package com.learningspring.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    private String getRootDir(){
        return "This is G-Root !";
    }

    //injecting properties of coach name and team name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach Name "+coachName+" and Club is"+teamName;
    }
}
