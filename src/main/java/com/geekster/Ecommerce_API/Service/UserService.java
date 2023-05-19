package com.geekster.Ecommerce_API.Service;

import com.geekster.Ecommerce_API.Models.User;
import com.geekster.Ecommerce_API.Repositary.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public void save(User myUser) {

        userRepo.save(myUser);
    }

    public String addUsers(List<User> userList) {
        List<User> users = userRepo.saveAll(userList);
        if(users.isEmpty()){
            return "Users not added...!!";
        }
        else {
            return "Users added successfully...!!";
        }
    }

    public User getUser(Integer userId) {
        Optional<User> user = userRepo.findById(userId);

        if(user.isEmpty()){
            throw new IllegalStateException("UserID not found...!!");
        }else{
            return user.get();
        }
    }
}
