package com.chern.serverapplication.electrostoreserver.repository;

import com.chern.serverapplication.electrostoreserver.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepo extends JpaRepository<Sale, Long> {

}
