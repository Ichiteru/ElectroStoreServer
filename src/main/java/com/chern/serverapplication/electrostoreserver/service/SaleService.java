package com.chern.serverapplication.electrostoreserver.service;

import com.chern.serverapplication.electrostoreserver.model.Sale;
import com.chern.serverapplication.electrostoreserver.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepo saleRepo;

    public List<Sale> getAll() {
        return saleRepo.findAll();
    }

    public Sale add(Sale sale) {
        saleRepo.save(sale);
        return sale;
    }
}
