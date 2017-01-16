package ru.pgolovkin.protobufexample.rest.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by p.golovkin on 16.01.2017.
 */
public class Person implements Serializable {

    private int id;
    private String name;
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

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

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return phoneNumbers != null ? phoneNumbers.equals(person.phoneNumbers) : person.phoneNumbers == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phoneNumbers != null ? phoneNumbers.hashCode() : 0);
        return result;
    }
    public class PhoneNumber implements Serializable {
        private String number;
        private PhoneType phoneType;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public PhoneType getPhoneType() {
            return phoneType;
        }

        public void setPhoneType(PhoneType phoneType) {
            this.phoneType = phoneType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PhoneNumber that = (PhoneNumber) o;

            if (number != null ? !number.equals(that.number) : that.number != null) return false;
            return phoneType == that.phoneType;
        }

        @Override
        public int hashCode() {
            int result = number != null ? number.hashCode() : 0;
            result = 31 * result + (phoneType != null ? phoneType.hashCode() : 0);
            return result;
        }
    }

    public enum PhoneType {
        HOME
    }
}


