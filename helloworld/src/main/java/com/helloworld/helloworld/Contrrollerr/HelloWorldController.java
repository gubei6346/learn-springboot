package com.helloworld.helloworld.Contrrollerr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("hello11")
    public String hello(){
        return "hello!12321!!!!";
    }
}
