package com.chern.serverapplication.electrostoreserver.service;

import com.chern.serverapplication.electrostoreserver.model.Product;
import com.chern.serverapplication.electrostoreserver.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
    }
}
