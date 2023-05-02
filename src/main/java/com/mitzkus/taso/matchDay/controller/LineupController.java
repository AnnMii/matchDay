package com.mitzkus.taso.matchDay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LineupController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/getLineup")
    public String getLineup() {
        return "Hello from LineupController!";
    }
}
