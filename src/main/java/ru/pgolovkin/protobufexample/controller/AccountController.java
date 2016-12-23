package ru.pgolovkin.protobufexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.proto.AccountPRO.Account;

@RestController
public class AccountController {

    @RequestMapping("/account")
    public Account getAccount() {
        Account account = Account.newBuilder().setAmount(123).setId(1).setName("acc").build();
        return account;
    }
}
