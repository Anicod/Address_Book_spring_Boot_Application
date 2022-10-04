package com.example.addressbookday9.service;

import com.example.addressbookday9.dto.AddressDto;
import com.example.addressbookday9.model.AddressModel;

public interface IAddressServe {
     AddressModel save(AddressDto addressDto);
     AddressModel getAll(AddressDto addressDto);
     AddressModel getById(AddressDto addressDto);
     AddressModel update(AddressDto addressDto);
}
