package com.youcode.marjanapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "category_promotion")
public class CategoryPromotion extends Promotion {
    @OneToOne
    @JsonIgnore
    private Category category;
}
