package ru.pgolovkin.protobufexample.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ru.pgolovkin.protobufexample")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
