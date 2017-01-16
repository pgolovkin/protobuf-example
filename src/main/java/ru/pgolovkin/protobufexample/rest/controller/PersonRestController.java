package ru.pgolovkin.protobufexample.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.rest.dto.Person;
import ru.pgolovkin.protobufexample.settings.UrlConstants;

/**
 * Created by p.golovkin on 16.01.2017.
 */
@RestController
public class PersonRestController {

    @RequestMapping(path = UrlConstants.PERSON_REST_URL, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Person getAccount() {
        Person person = new Person();
        person.setId(123);
        person.setName("345345345");

        return person;
    }
}
