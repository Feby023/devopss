package com.example.demoshaun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoshaun.domain.Login1;


@Repository
public interface LoginRepo extends JpaRepository<Login1, String>
{
    Login1 findByUsernameAndPassword(String username, String password);
}