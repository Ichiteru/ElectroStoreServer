package com.chern.serverapplication.electrostoreserver.controller;

import com.chern.serverapplication.electrostoreserver.model.Product;
import com.chern.serverapplication.electrostoreserver.service.ProductService;
import com.chern.serverapplication.electrostoreserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @PostMapping("/product")
    public boolean add(@RequestBody Product product){
        return productService.add(product);
    }

    @GetMapping("/product/{id}")
    public Product get(@PathVariable Long id){
        return productService.findById(id);
    }

    @PutMapping("/product/update")
    public boolean update(@RequestBody Product product){
        return productService.update(product);
    }
}
