package com.example.addressbookday9.controller;

import com.example.addressbookday9.dto.AddressDto;
import com.example.addressbookday9.dto.AddressResponseDto;
import com.example.addressbookday9.model.AddressModel;
import com.example.addressbookday9.service.IAddressServe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AddressController {

    @Autowired
    IAddressServe iAddressServe;

    @PostMapping("/postdtobyserviclayer")
    ResponseEntity<AddressResponseDto> postDtoByServiceLayer(@Valid @RequestBody AddressDto addressDto){
       AddressModel addressModel = iAddressServe.save(addressDto);
       AddressResponseDto addressResponseDto = new AddressResponseDto(addressModel, "data posted successfully in database");
       return new ResponseEntity<>(addressResponseDto, HttpStatus.OK);
    }
    @GetMapping("/getdtobyservice")
    ResponseEntity<AddressResponseDto> getDtoByServiceLayer(){
        List<AddressModel> addressModels = iAddressServe.getAll();
        AddressResponseDto addressResponseDto = new AddressResponseDto(addressModels, "get all data from the list");
        return new ResponseEntity<>(addressResponseDto, HttpStatus.OK);

    }
    @GetMapping("/getbyidbydtoservic")
    ResponseEntity<AddressResponseDto> getByIdByDtoServiceLayer(@RequestParam Integer Id){
        AddressModel addressModel = iAddressServe.getById(Id);
        AddressResponseDto addressResponseDto = new AddressResponseDto(addressModel, "successfully found by id");
        return new ResponseEntity<>(addressResponseDto, HttpStatus.OK);

    }
    @PutMapping("/putbydtosurviclayer/{Id}")
    ResponseEntity<AddressResponseDto> putByNameByDtoByServicLayer(@PathVariable Integer Id, @RequestBody AddressDto addressDto){
       AddressModel addressModel = new AddressModel(addressDto);
       AddressModel addressModel1 = iAddressServe.update(Id, addressModel);
        AddressResponseDto addressResponseDto = new AddressResponseDto(addressModel1, "data updated successfully");
        return new ResponseEntity<>(addressResponseDto, HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    void deleteById(@RequestParam Integer Id){
        iAddressServe.deleteById(Id);
    }
    @GetMapping("byname/{name}")
    ResponseEntity<AddressResponseDto> findByName(@PathVariable String name){
       List<AddressModel> addressModels = iAddressServe.findByName(name);
       AddressResponseDto addressResponseDto = new AddressResponseDto(addressModels, "found data by name successfully");
       return new ResponseEntity<>(addressResponseDto, HttpStatus.OK);
    }
    @GetMapping("bycity/{city}")
    ResponseEntity<AddressResponseDto> findByCity(@PathVariable String city){
        List<AddressModel> addressModels = iAddressServe.findByCity(city);
        AddressResponseDto addressResponseDto = new AddressResponseDto(addressModels, "city found succcessfully");
        return new ResponseEntity<>(addressResponseDto, HttpStatus.OK);
    }


}
