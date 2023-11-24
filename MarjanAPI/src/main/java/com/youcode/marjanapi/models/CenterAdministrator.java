package com.youcode.marjanapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "center_administrator")
@NoArgsConstructor
@Getter
@Setter
public class CenterAdministrator extends Administrator{
    private String city;
}
