package com.example.addressbookday9.exception;

import com.example.addressbookday9.dto.AddressResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AddressBookExceptionHandler {
@ExceptionHandler(AddressBookException.class)
    ResponseEntity<AddressResponseDto> handler(AddressBookException exception){
    AddressResponseDto addressResponseDto = new AddressResponseDto("exception while processing request", exception.getMessage());
    return new ResponseEntity<>(addressResponseDto, HttpStatus.BAD_REQUEST);
}
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<AddressResponseDto> method(MethodArgumentNotValidException exception){
        AddressResponseDto addressResponseDto = new AddressResponseDto("exception while processing request", exception.getMessage());
        return new ResponseEntity<>(addressResponseDto, HttpStatus.BAD_REQUEST);
    }
}
