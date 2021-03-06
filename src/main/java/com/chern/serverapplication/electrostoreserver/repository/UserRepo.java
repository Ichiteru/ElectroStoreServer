package com.chern.serverapplication.electrostoreserver.repository;

import com.chern.serverapplication.electrostoreserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    public Optional<User> findByUsernameAndPassword(String username, String password);
    public Optional<User> findByUsername(String username);
}
