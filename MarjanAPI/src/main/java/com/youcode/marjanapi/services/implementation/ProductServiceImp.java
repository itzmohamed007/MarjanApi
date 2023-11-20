package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.Product;
import com.youcode.marjanapi.repositories.CategoryRepository;
import com.youcode.marjanapi.repositories.ProductRepository;
import com.youcode.marjanapi.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements CrudService<Product> {
    private final ProductRepository repository;

    @Autowired
    public ProductServiceImp(ProductRepository productRepository) {
        this.repository = productRepository;
    }
    @Override
    public boolean create(Product product) {
        try {
            repository.save(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Product> readAll() {
        return repository.findAll();
    }
}
