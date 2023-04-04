package com.example.springboottest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class OthertController {

    @GetMapping(value = "/about")
    public String about(){
        return "about";
    }

}
