package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controllers specify endpoints and handle user's requests
// Mapping is used for annotations to Controller's methods, whereas @GetMapping is a subclass of @RequestMapping

@RestController
class HelloWorld {

    @GetMapping("/hello-world")
    public String hello() {
        return "Hello Groovy World RESTful with Spring Boot";
    }

}
