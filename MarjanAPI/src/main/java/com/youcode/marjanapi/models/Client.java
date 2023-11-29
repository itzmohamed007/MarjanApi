package com.youcode.marjanapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Client extends User {
    @OneToOne(mappedBy = "client")
    @JsonIgnore
    private LoyaltyCard loyaltyCard;
}
