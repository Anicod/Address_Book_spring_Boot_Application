package com.example.addressbookday9.repository;

import com.example.addressbookday9.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<AddressModel, Integer> {
    @Query(value = "select * from address_model where first_name=:name", nativeQuery = true)
    List<AddressModel> findAddressModelByFirstName(String name);

    @Query(value = "select * from address_model where city=:cityName", nativeQuery = true)
    List<AddressModel> findAddressModelByCity(String cityName);


}
