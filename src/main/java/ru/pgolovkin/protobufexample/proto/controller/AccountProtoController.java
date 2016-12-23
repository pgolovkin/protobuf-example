package ru.pgolovkin.protobufexample.proto.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.proto.AccountPRO.Account;
import ru.pgolovkin.protobufexample.settings.UrlConstants;

@RestController
public class AccountProtoController {

    @RequestMapping(path = UrlConstants.ACCOUNT_PROTO_URL, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Account getAccount() {
        Account account = Account.newBuilder().setAmount(123).setId(1).setName("acc").build();
        return account;
    }
}
