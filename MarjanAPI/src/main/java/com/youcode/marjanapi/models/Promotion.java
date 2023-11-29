package com.youcode.marjanapi.models;

import com.youcode.marjanapi.Observer.Observable;
import com.youcode.marjanapi.Observer.Observer;
import com.youcode.marjanapi.enums.PromotionStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class Promotion implements Observable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private float percentage;
    @Enumerated(EnumType.STRING)
    private PromotionStatus status;
    @Transient
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}
