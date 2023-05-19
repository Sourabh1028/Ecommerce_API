package com.geekster.Ecommerce_API.Controller;

import com.geekster.Ecommerce_API.Models.Product;
import com.geekster.Ecommerce_API.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(value = "/")
    public void addProduct(@RequestBody Product myProduct){
        productService.save(myProduct);
    }

    @GetMapping()
    public List<Product> getProducts(@RequestParam String category){
        return productService.getAll(category);
    }

    @DeleteMapping("{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        return productService.delete(productId);
    }
}
