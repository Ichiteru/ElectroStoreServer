package com.chern.serverapplication.electrostoreserver.controller;

import com.chern.serverapplication.electrostoreserver.model.ProductName;
import com.chern.serverapplication.electrostoreserver.service.ProductNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductNameController {

    @Autowired
    private ProductNameService productNameService;

    @GetMapping("/productNames")
    public List<ProductName> getAll(){
        return productNameService.getAll();
    }
}
