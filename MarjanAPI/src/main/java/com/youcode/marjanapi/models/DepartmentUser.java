package com.youcode.marjanapi.models;

import com.youcode.marjanapi.Observer.Observable;
import com.youcode.marjanapi.Observer.Observer;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@Table(name = "department_administrator")
public class DepartmentUser extends User implements Observer {
    @Override
    public void update() {
        System.out.println("received promotion update!");
    }
}
