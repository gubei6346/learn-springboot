package com.helloworld.helloworld.Contrrollerr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //http://localhost:8080/hello11?nickname=zhangsan&phone=123
    @RequestMapping(value = "/hello11",method = RequestMethod.GET)
    @GetMapping("/hello11")
    public String hello(String nickname,String phone){
        System.out.println(phone);
        return "hello!12321!!!!"+nickname;
    }
}
