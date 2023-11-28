package com.youcode.marjanapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class LoyaltyCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private int points;
    @OneToOne
    @JsonIgnore
    private Client client;
}
