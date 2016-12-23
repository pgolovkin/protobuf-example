package ru.pgolovkin.protobufexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pgolovkin.protobufexample.proto.DepositPRO.Deposit;

@RestController
public class DepositController {

    @RequestMapping("/deposit")
    public Deposit getDeposit() {
        Deposit deposit =
            Deposit.newBuilder().setAmount(12323).setId(1).setName("name").setAccountType(Deposit.DepositType.LONG)
                .build();
        return deposit;
    }
}
