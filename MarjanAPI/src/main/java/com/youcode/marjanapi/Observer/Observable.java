package com.youcode.marjanapi.Observer;

public interface Observable {
     void addObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObserver();
}
