package com.chern.serverapplication.electrostoreserver.repository;

import com.chern.serverapplication.electrostoreserver.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
