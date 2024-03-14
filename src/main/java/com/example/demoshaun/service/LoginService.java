package com.example.demoshaun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoshaun.domain.Login1;
import com.example.demoshaun.repository.LoginRepo;

@Service
public class LoginService 
{
    @Autowired
    private LoginRepo rep;

    public Login1 log(String username, String password)
    {
        Login1 user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}
