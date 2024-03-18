package com.belebele.springbootdemo3.controllerr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    //http://localhost:8080//hello
    @GetMapping("bili")
    public String hello(){
        return "hello world111";
    }
}
