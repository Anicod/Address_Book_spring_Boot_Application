package com.example.addressbookday9.service;

import com.example.addressbookday9.dto.AddressDto;
import com.example.addressbookday9.model.AddressModel;
import com.example.addressbookday9.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressServe implements IAddressServe {
    @Autowired
    AddressRepository addressRepository;
    @Override
    public AddressModel save(AddressDto addressDto) {
        AddressModel addressModel = null;
       addressModel =  new AddressModel(addressDto);
       addressRepository.save(addressModel);
       return addressModel;
    }

    @Override
    public List<AddressModel> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public AddressModel getById(Integer Id) {
        if(addressRepository.existsById(Id)){
            log.info("Id found successfully");
            AddressModel addressModel= addressRepository.findAll().get(Id);
            return addressModel;
        }
        return null;
    }
    @Override
    public AddressModel update(Integer Id, AddressModel addressModel) {
        AddressModel addressModel1 = addressRepository.findById(Id).orElse(null);
        if (addressModel1 != null){
            addressModel1.setFirstName(addressModel.getFirstName());
            addressModel1.setLastName(addressModel.getLastName());
            addressModel1.setAddress(addressModel.getAddress());
            addressModel1.setCity(addressModel.getCity());
            addressModel1.setCity(addressModel.getCity());
            addressModel1.setZipCode(addressModel.getZipCode());
            addressModel1.setNote(addressModel.getNote());
            return addressRepository.save(addressModel1);
        }
        return null;
    }

    @Override
    public void deleteById(Integer Id) {
        if(addressRepository.existsById(Id)){
            addressRepository.deleteById(Id);
            log.info("Id deleted successfully");
        }
        else {
            log.info("Id does not exist");
        }
    }



}
