package com.youcode.marjanapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String name;
    @OneToOne(mappedBy = "category")
    @JsonIgnore
    private CategoryPromotion categoryPromotion;
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;
}