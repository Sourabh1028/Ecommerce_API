package com.geekster.Ecommerce_API.Controller;

import com.geekster.Ecommerce_API.Models.User;
import com.geekster.Ecommerce_API.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/")
    public String addUsers(@RequestBody List<User> userList){
        return userService.addUsers(userList);
    }

    @GetMapping()
    public User getUser(@RequestParam Integer userId){
        return userService.getUser(userId);
    }
}
