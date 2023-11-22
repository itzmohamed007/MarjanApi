package com.youcode.marjanapi.services;


import java.util.Optional;
import java.util.UUID;

public interface PromotionService<O> extends CrudService<O>{
    Optional<O> read(UUID uuid);
    boolean update(O o);
    boolean delete(UUID uuid);
}