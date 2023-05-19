package com.geekster.Ecommerce_API.Repositary;

import com.geekster.Ecommerce_API.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    Product findByProductId(Integer productId);

    List<Product> findByproductCategory(String category);

}
