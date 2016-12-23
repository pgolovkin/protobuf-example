package ru.pgolovkin.protobufexample.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.rest.dto.Account;
import ru.pgolovkin.protobufexample.settings.UrlConstants;

@RestController
public class AccountRestController {

    @RequestMapping(UrlConstants.ACCOUNT_REST_URL)
    public Account getAccount() {
        Account account = new Account();
        account.setAmount(123);
        account.setId(1);
        account.setName("acc");
        return account;
    }
}
