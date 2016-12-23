package ru.pgolovkin.protobufexample.proto.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.proto.AddressBookPRO.Person;
import ru.pgolovkin.protobufexample.settings.UrlConstants;

@RestController
public class PersonProtoController {

    @RequestMapping(path = UrlConstants.PERSON_PROTO_URL, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Person getPerson() {
        Person john = Person.newBuilder().setId(123).setName("name")
            .addPhone(Person.PhoneNumber.newBuilder().setNumber("23213213").setType(Person.PhoneType.HOME)).build();

        return john;
    }
}
