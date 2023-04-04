package com.example.springboottest.beans;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {

    public FirstBean(){
        System.out.println("Creating Test Bean");
    }
}
