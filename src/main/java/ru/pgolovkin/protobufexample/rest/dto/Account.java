package ru.pgolovkin.protobufexample.rest.dto;

import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {

    private long amount;
    private int id;
    private String name;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return amount == account.amount &&
            id == account.id &&
            Objects.equals(name, account.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, id, name);
    }

    @Override
    public String toString() {
        return "Account{" +
            "amount=" + amount +
            ", id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
