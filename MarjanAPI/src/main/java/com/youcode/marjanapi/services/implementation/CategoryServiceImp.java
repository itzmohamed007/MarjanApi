package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.Category;
import com.youcode.marjanapi.repositories.CategoryRepository;
import com.youcode.marjanapi.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CrudService<Category> {
    private final CategoryRepository repository;

    @Autowired
    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.repository = categoryRepository;
    }
    @Override
    public boolean create(Category category) {
        try {
            repository.save(category);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Category> readAll() {
        return repository.findAll();
    }
}
