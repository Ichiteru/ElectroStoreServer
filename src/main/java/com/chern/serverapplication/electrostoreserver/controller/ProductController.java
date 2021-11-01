package com.chern.serverapplication.electrostoreserver.controller;

import com.chern.serverapplication.electrostoreserver.model.Product;
import com.chern.serverapplication.electrostoreserver.service.ProductService;
import com.chern.serverapplication.electrostoreserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAll();
    }
}
