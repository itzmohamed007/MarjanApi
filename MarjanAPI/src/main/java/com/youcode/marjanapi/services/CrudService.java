package com.youcode.marjanapi.services;

import java.util.List;

public interface CrudService<O> {
    boolean create(O o);
    List<O> readAll();
}
