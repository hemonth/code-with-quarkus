package com.hemonth.quarkus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RestController
public class ExampleResource {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/test")
    public String helloWorld() {
        return "hello world";
    }

}
