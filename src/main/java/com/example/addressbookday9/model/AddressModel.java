package com.example.addressbookday9.model;

import com.example.addressbookday9.dto.AddressDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public Long zipCode;
    public String note;

    public AddressModel(){

    }
    public AddressModel(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public AddressModel(AddressDto addressDto){
        this.firstName = addressDto.firstName;
        this.lastName = addressDto.lastName;
        this.address = addressDto.address;
        this.city = addressDto.city;
        this.state = addressDto.state;
        this.zipCode = addressDto.zipCode;
        this.note = addressDto.note;
    }
}
