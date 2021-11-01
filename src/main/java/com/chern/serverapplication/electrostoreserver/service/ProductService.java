package com.chern.serverapplication.electrostoreserver.service;

import com.chern.serverapplication.electrostoreserver.model.Product;
import com.chern.serverapplication.electrostoreserver.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public boolean add(Product product) {
        if (productRepo.findByModel(product.getModel()).isPresent())
            return false;
        else {
            productRepo.save(product);
            return true;
        }
    }

    public Product findById(Long id) {
        return productRepo.findById(id).get();
    }

    public boolean update(Product product) {
        boolean b = productRepo.existsByModel(product.getModel());
        Optional<Product> byId = productRepo.findById(product.getId());
        if (product.getModel().equals(byId.get().getModel()) || !productRepo.existsByModel(product.getModel())){
            productRepo.save(product);
            return true;
        }
        return false;
    }
}
