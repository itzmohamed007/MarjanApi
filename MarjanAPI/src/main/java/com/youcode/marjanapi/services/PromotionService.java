package com.youcode.marjanapi.services;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PromotionService<O> extends CrudService<O>{
    Optional<O> read(UUID uuid);
    boolean update(O o);
    boolean delete(UUID uuid);
}