package com.example.addressbookday9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @GetMapping("/get")
    public String getMessage(){
        return  "Welcome to address book program";
    }

}
