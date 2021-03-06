package com.chern.serverapplication.electrostoreserver.service;

import com.chern.serverapplication.electrostoreserver.model.Supplier;
import com.chern.serverapplication.electrostoreserver.repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;


    public List<Supplier> getAll() {
        return supplierRepo.findAll();
    }

    public boolean add(Supplier supplier) {
        if (!supplierRepo.existsByName(supplier.getName())){
            supplierRepo.save(supplier);
            return true;
        }
        return false;
    }

    public void delete(Long id) {
        supplierRepo.deleteById(id);
    }
}
