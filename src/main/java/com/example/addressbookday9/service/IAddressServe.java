package com.example.addressbookday9.service;

import com.example.addressbookday9.dto.AddressDto;
import com.example.addressbookday9.model.AddressModel;

import java.util.List;

public interface IAddressServe {
     AddressModel save(AddressDto addressDto);
     List<AddressModel> getAll();
     AddressModel getById(Integer Id);
     AddressModel update(Integer Id, AddressModel addressModel);
     void deleteById(Integer Id);
      List<AddressModel> findByName(String namme);
      List<AddressModel> findByCity(String city);
}
