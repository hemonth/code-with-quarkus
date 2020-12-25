package com.hemonth.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RestController
public class ExampleResource {

    @ConfigProperty(name = "greeting.name")
    private String greeting;

    @GetMapping("/hello")
    public String hello() {
        return greeting;
    }

    @GetMapping("/test")
    public String helloWorld() {
        return "hello world";
    }

}
