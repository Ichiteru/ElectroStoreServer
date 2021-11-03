package com.chern.serverapplication.electrostoreserver.controller;

import com.chern.serverapplication.electrostoreserver.model.Sale;
import com.chern.serverapplication.electrostoreserver.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping("/sales")
    public List<Sale> getAll(){
        return saleService.getAll();
    }

    @PostMapping("/sale")
    public Sale add(@RequestBody Sale sale){
        return saleService.add(sale);
    }
}
