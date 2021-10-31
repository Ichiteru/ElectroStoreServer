package com.chern.serverapplication.electrostoreserver.repository;

import com.chern.serverapplication.electrostoreserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
