package com.youcode.marjanapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String name;
    private String brand;
    private float price;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private ProductPromotion productPromotion;
    @ManyToOne
    private Category category;
}
