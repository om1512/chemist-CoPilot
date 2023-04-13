package com.example.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.IMS.model.User;

@Repository
public interface userRepository extends JpaRepository<User, Long>{

}
