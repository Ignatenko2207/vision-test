package com.coupa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisionController {

    @GetMapping
    public String getResponse() {
        return "Hello from Vision!!!";
    }
}
