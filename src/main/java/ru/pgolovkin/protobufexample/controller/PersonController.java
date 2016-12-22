package ru.pgolovkin.protobufexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}
