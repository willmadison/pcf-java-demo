package com.willmadison.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @RequestMapping("/sayHello")
    public String greet(@RequestParam(value="name", required=false, defaultValue="Anonymous") String name) {
        return "Hello " + name + "!";
    }
}
