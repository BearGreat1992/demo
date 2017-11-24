package com.service.demo.controller;

import org.springframework.stereotype.Component;


@Component
public class DemoDelegate implements Demo {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
