package com.example.addressbookday9.controller;

import com.example.addressbookday9.model.AddressModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @GetMapping("/get")
    public String getMessage(){
        AddressModel addressModel = new AddressModel("animesh", "Raj");
        return "welcome"+" "+addressModel.getFirstName()+" "+addressModel.getLastName();
    }
    //uc2
    @GetMapping("/getbyinput")
    ResponseEntity<AddressModel> getmessagebyinput(@RequestParam Integer Id, String firstName, String lastName, String address, String city, String state, Long zipCod, String note){
        AddressModel addressModel = new AddressModel(Id, firstName, lastName, address, city, state, zipCod, note);
        return new ResponseEntity<>(addressModel, HttpStatus.OK);
    }
    @GetMapping("getbyid/{Id}")
    ResponseEntity<AddressModel> getById(@PathVariable Integer Id, @RequestParam String firstName, String lastName, String address, String city, String state, Long zipCod, String note ){
        AddressModel addressModel = new AddressModel(Id, firstName, lastName, address, city, state, zipCod, note);
        return new ResponseEntity<>(addressModel, HttpStatus.OK);
    }
    @PutMapping("/put/{firstName}")
    ResponseEntity<AddressModel> putbyname(@PathVariable String firstName, @RequestParam Integer Id, String lastName, String address, String city, String state, Long zipCod, String note){
        AddressModel addressModel = new AddressModel(Id, firstName, lastName, address, city, state, zipCod, note);
        return new ResponseEntity<>(addressModel, HttpStatus.OK);
    }
    @PostMapping("/post")
    ResponseEntity<AddressModel> postdata(@RequestBody AddressModel addressModel){
        AddressModel addressModel1 = new AddressModel(addressModel.getId(), addressModel.getFirstName(), addressModel.getLastName(), addressModel.getAddress(), addressModel.getCity(), addressModel.getState(), addressModel.getZipCode(), addressModel.getNote());
        return new ResponseEntity<>(addressModel1, HttpStatus.OK);
    }

}
