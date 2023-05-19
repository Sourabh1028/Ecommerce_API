package com.geekster.Ecommerce_API.Service;

import com.geekster.Ecommerce_API.Models.Product;
import com.geekster.Ecommerce_API.Repositary.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public void save(Product myProduct) {
        productRepo.save(myProduct);
    }

    public List<Product> getAll(String category) {
        if(category==null){
            return productRepo.findAll();
        }
        else {
            return productRepo.findByproductCategory(category);
        }
    }

    public String delete(Integer productId) {
        if (productId==null){
            throw new IllegalStateException("Enter Valid Id..!!");
        }else {
            productRepo.deleteById(productId);
            return "Product Deleted Successfully...!!";
        }
    }
}
