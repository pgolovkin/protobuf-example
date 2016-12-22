package ru.pgolovkin.protobufexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.proto.PersonPRO;

@RestController
public class PersonController {

    @RequestMapping("/")
    public PersonPRO.Person index() {
        PersonPRO.Person personPRO = PersonPRO.Person.newBuilder().setCourseName("1").setId(1).build();
        return personPRO;
    }
}
