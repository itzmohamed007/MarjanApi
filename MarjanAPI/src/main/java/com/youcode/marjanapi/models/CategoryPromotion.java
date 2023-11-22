package com.youcode.marjanapi.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@ToString
@Entity
@Table(name = "category_promotion")
public class CategoryPromotion extends Promotion{
    @JsonManagedReference
    @OneToOne()
    private Category category;
}
