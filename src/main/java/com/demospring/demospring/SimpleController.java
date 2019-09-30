package com.demospring.demospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @GetMapping("/hello")
    public String homePage() {
        return "Hello World - v4";
    }
}