package com.geekster.Ecommerce_API.Controller;

import com.geekster.Ecommerce_API.Models.Address;
import com.geekster.Ecommerce_API.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "/")
    public void addAddress(@RequestBody Address myAddress){
        addressService.save(myAddress);
    }
}
