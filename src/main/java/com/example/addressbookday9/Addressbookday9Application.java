package com.example.addressbookday9;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Addressbookday9Application {

    public static void main(String[] args) {
        SpringApplication.run(Addressbookday9Application.class, args);
        log.info("hello address book");

    }

}
