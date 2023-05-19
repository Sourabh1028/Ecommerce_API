package com.geekster.Ecommerce_API.Repositary;

import com.geekster.Ecommerce_API.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUserId(Integer userId);
}
