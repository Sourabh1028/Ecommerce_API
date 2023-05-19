package com.geekster.Ecommerce_API.Service;

import com.geekster.Ecommerce_API.Models.Address;
import com.geekster.Ecommerce_API.Models.Order;
import com.geekster.Ecommerce_API.Models.Product;
import com.geekster.Ecommerce_API.Models.User;
import com.geekster.Ecommerce_API.Repositary.AddressRepo;
import com.geekster.Ecommerce_API.Repositary.OrderRepo;
import com.geekster.Ecommerce_API.Repositary.ProductRepo;
import com.geekster.Ecommerce_API.Repositary.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepo iOrderRepo;
    @Autowired
    AddressRepo iAddressRepo;
    @Autowired
    ProductRepo iProductRepo;
    @Autowired
    UserRepo iUserRepo;


    public void createOrder(Order myOrder) {

        Integer addressID = myOrder.getAddressId().getAddressId();
        Address myAddress  = iAddressRepo.findByAddressId(addressID);

        Integer productId = myOrder.getProductId().getProductId();
        Product myProduct = iProductRepo.findByProductId(productId);

        Integer userId = myOrder.getUserId().getUserId();
        User myUser = iUserRepo.findByUserId(userId);

        if(myAddress !=null && myProduct!= null && myUser != null) {
            myOrder.setAddressId(myAddress);
            myOrder.setProductId(myProduct);
            myOrder.setUserId(myUser);


            iOrderRepo.save(myOrder);
        }
        else
        {
            throw new IllegalStateException("Id's sent for  creating order are not valid");
        }


    }

    public Order getOrder(Integer orderId) {
        Optional<Order> optionalOrder = iOrderRepo.findById(orderId);
        if (optionalOrder.isEmpty()){
            throw  new IllegalStateException("OrderId not found...!!");
        }
        else {
            return optionalOrder.get();
        }
    }
}
