package ru.pgolovkin.protobufexample.proto.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.proto.DepositPRO.Deposit;
import ru.pgolovkin.protobufexample.settings.UrlConstants;

@RestController
public class DepositProtoController {

    @RequestMapping(path = UrlConstants.DEPOSIT_PROTO_URL, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Deposit getDeposit() {
        Deposit deposit =
            Deposit.newBuilder().setAmount(12323).setId(1).setName("name").setAccountType(Deposit.DepositType.LONG)
                .build();
        return deposit;
    }
}
