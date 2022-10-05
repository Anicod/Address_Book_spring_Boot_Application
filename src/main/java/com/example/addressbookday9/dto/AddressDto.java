package com.example.addressbookday9.dto;

import lombok.Data;

@Data
public class AddressDto {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public Long zipCode;
    public String note;

    public AddressDto( String firstName, String lastName, String address, String city, String state, Long zipCode, String note) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.note = note;
    }
}
