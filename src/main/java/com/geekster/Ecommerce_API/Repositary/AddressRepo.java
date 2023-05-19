package com.geekster.Ecommerce_API.Repositary;

import com.geekster.Ecommerce_API.Models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {

    Address findByAddressId(Integer addressId);
}
