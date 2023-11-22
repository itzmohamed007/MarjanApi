package com.youcode.marjanapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@Entity
@Table(name = "category_promotion")
public class CategoryPromotion extends Promotion{
    @OneToOne
    private Category category;
}
