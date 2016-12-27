package ru.pgolovkin.protobufexample.proto.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping(path = UrlConstants.PERSON_PROTO_URL, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE, method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void getPerson(HttpServletResponse response) {

        Person john = Person.newBuilder().setId(123).setName("name")
            .addPhone(Person.PhoneNumber.newBuilder().setNumber("23213213").setType(Person.PhoneType.HOME)).build();

        try {
            response.setContentType(MediaType.APPLICATION_OCTET_STREAM.getType());
            john.writeTo(response.getOutputStream());
            response.getOutputStream().close();
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
}
