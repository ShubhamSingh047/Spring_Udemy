package com.learningspring.mycoolapp.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return "Hello world";
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "do shoulder biceps triceps !";
    }

    //expose a new end point for rest
    @GetMapping("/rest")
    public String getRest(){
        return "rest now !";
    }

}
