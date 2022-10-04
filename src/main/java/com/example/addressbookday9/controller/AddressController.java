package com.example.addressbookday9.controller;

import com.example.addressbookday9.model.AddressModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @GetMapping("/get")
    public String getMessage(){
        AddressModel addressModel = new AddressModel("animesh", "Raj");
        return "welcome"+" "+addressModel.getFirstName()+" "+addressModel.getLastName();
    }

}
