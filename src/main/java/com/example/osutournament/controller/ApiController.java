package com.example.osutournament.controller;

import jdk.jfr.ContentType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello(@RequestParam(defaultValue = "API") String name) {
        return "Hello " + name;
    }
}
