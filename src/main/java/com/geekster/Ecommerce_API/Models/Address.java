package com.geekster.Ecommerce_API.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;
    private String addressLandmark;
    private String addressPhoneNumber;
    private String zipCode;
    private String addressState;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User userId;


}
