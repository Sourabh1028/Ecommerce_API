package com.geekster.Ecommerce_API.Service;

import com.geekster.Ecommerce_API.Models.Address;
import com.geekster.Ecommerce_API.Repositary.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public void save(Address myAddress) {
        addressRepo.save(myAddress);
    }
}
