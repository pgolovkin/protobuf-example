package ru.pgolovkin.protobufexample.proto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.proto.AddressBookPRO.Person;
import ru.pgolovkin.protobufexample.settings.UrlConstants;

@RestController
public class PersonProtoController {

    @RequestMapping(path = UrlConstants.PERSON_PROTO_URL, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Person getPerson() {

        Person john = Person.newBuilder().setId(123).setName("345345345").build();
        return john;
    }
}
