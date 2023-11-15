package com.youcode.marjanapi.services;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PromotionService<O>{
    Optional<O> create(O o);
    Optional<O> read(UUID uuid);
    List<O> readAll();
    Optional<O> update(O o);
    boolean delete(UUID uuid);
}
