package com.chern.serverapplication.electrostoreserver.repository;

import com.chern.serverapplication.electrostoreserver.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Long> {

    public boolean existsByName(String name);
}
