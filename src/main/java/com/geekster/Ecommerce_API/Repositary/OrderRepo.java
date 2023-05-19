package com.geekster.Ecommerce_API.Repositary;

import com.geekster.Ecommerce_API.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
