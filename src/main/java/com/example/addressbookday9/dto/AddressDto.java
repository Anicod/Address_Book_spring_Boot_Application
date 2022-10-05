package com.example.addressbookday9.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class AddressDto {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "name is invalid")
    public String firstName;
    @Pattern(regexp = "^[a-zA-Z\\s]{2,}$", message = "last name is invalid")
    public String lastName;
    @NotEmpty(message = "address not empty")
    @Pattern(regexp = "^[a-zA-Z\\s]{2,}$", message = "address is invalid")
    public String address;
    @NotEmpty(message = "city not empty")
    @Pattern(regexp = "^[a-zA-Z\\s]{2,}$", message = "city is invalid")
    public String city;
    @NotEmpty(message = "state not empty")
    @Pattern(regexp = "^[a-zA-Z\\s]{2,}$", message = "state is invalid")
    public String state;
    @NotNull(message = "zip code is requried")
    @Min(value = 10000, message = "pin code is not valid")
    @Max(value = 99999, message = "not greter than 4 digit")
    public Long zipCode;
    @NotEmpty(message = "state not empty")
    @Pattern(regexp = "^[a-zA-Z\\s]{2,}$", message = "note is invalid")
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
