package com.youcode.marjanapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "product_promotion")
public class ProductPromotion extends Promotion {
    @OneToOne
    private Product product;
}
