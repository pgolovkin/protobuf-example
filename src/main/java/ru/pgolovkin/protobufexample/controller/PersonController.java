package ru.pgolovkin.protobufexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.proto.AddressBookPRO.Person;

@RestController
public class PersonController {

    @RequestMapping("/person")
    public Person getPerson() {
        Person john = Person.newBuilder().setId(123).setName("name")
            .addPhone(Person.PhoneNumber.newBuilder().setNumber("23213213").setType(Person.PhoneType.HOME)).build();

        return john;
    }
}
