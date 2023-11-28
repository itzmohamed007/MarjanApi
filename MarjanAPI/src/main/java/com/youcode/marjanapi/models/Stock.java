package com.youcode.marjanapi.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Entity
@Data
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String address;
    @OneToMany(mappedBy = "stock")
    private Set<Category> categories;
}
