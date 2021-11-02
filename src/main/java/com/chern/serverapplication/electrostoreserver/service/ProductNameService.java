package com.chern.serverapplication.electrostoreserver.service;

import com.chern.serverapplication.electrostoreserver.model.ProductName;
import com.chern.serverapplication.electrostoreserver.repository.ProductNameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductNameService {

    @Autowired
    private ProductNameRepo productNameRepo;

    public List<ProductName> getAll() {
        return productNameRepo.findAll();
    }

    public boolean add(ProductName productName) {
        if (!productNameRepo.existsByName(productName.getName())){
            productNameRepo.save(productName);
            return true;
        }
        return false;
    }

    public void delete(Long id) {
        productNameRepo.deleteById(id);
    }
}
