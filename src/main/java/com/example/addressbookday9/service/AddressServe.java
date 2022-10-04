package com.example.addressbookday9.service;

import com.example.addressbookday9.dto.AddressDto;
import com.example.addressbookday9.model.AddressModel;
import org.springframework.stereotype.Service;

@Service
public class AddressServe implements IAddressServe {
    @Override
    public AddressModel save(AddressDto addressDto) {
        AddressModel addressModel = null;
       addressModel =  new AddressModel(addressDto);
       return addressModel;
    }

    @Override
    public AddressModel getAll(AddressDto addressDto) {
        AddressModel addressModel = null;
        addressModel  = new AddressModel(addressDto);
        return addressModel;
    }

    @Override
    public AddressModel getById(AddressDto addressDto) {
        AddressModel addressModel = null;
      addressModel = new AddressModel(addressDto);
      return addressModel;
    }

    @Override
    public AddressModel update(AddressDto addressDto) {
        AddressModel addressModel = null;
       addressModel = new AddressModel(addressDto);
      return addressModel;
    }


}
