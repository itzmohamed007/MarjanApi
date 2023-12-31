package com.youcode.marjanapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "center_administrator")
@NoArgsConstructor
@Getter
@Setter
public class CenterUser extends User {
    private String city;
}
