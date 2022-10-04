package com.example.addressbookday9.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;
    public String FirstName;
    public String lastName;

    public AddressModel(String firstName, String lastName) {
        FirstName = firstName;
        this.lastName = lastName;
    }
    public AddressModel(){

    }
}
