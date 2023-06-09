package com.reactive.swaggerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/")
    public List<String> getTest() {
        return Arrays.asList("Hi", "test");
    }

}
