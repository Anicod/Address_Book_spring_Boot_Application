package com.example.addressbookday9.model;

import com.example.addressbookday9.dto.AddressDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
