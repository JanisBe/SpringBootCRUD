package com.websystique.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.User2;

@Repository
public interface UserRepository extends JpaRepository<User2, Long> {

    User2 findByName(String name);

}
