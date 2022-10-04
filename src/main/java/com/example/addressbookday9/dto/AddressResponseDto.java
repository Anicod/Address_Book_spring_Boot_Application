package com.example.addressbookday9.dto;

public class AddressResponseDto {
    public Object data;
    public String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AddressResponseDto(Object data, String message) {
        this.data = data;
        this.message = message;
    }
    public AddressResponseDto(){

    }
}
