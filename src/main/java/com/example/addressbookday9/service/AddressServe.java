package com.example.addressbookday9.service;

import com.example.addressbookday9.dto.AddressDto;
import com.example.addressbookday9.model.AddressModel;
import org.springframework.stereotype.Service;

@Service
public class AddressServe {
    public AddressModel save(AddressDto addressDto){
        AddressModel addressModel = null;
        addressModel =  new AddressModel(addressDto);
        return addressModel;
    }
    public AddressModel getall(AddressDto addressDto){
        AddressModel addressModel = null;
        addressModel  = new AddressModel(addressDto);
        return addressModel;
    }

    public AddressModel getById(AddressDto addressDto){
        AddressModel addressModel = null;
        addressModel = new AddressModel(addressDto);
        return addressModel;
    }

    public AddressModel updateById(AddressDto addressDto){
        AddressModel addressModel = null;
        addressModel = new AddressModel(addressDto);
        return addressModel;
    }

}
