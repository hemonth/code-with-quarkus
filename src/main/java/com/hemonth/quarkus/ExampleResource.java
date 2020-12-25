package com.hemonth.quarkus;

import com.hemonth.quarkus.config.Base64Value;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RestController
public class ExampleResource {

    @ConfigProperty(name = "greeting.name")
    private String greeting;

    @ConfigProperty(name = "greeting.base64name")
    private Base64Value base64value;

    @GetMapping("/hello")
    public String hello() {
        return greeting;
    }

    @GetMapping("/base64")
    public String helloWorld() {
        return base64value.getValue();
    }

}
