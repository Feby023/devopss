package com.example.demoshaun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoshaun.domain.Login1;
import com.example.demoshaun.repository.LoginRepo;

@Service
public class registration {
    @Autowired
    private LoginRepo rep;
    public Login1 saveUser(String username, String password) {
        Login1 user = new Login1();
        user.setUsername(username);
        user.setPassword(password);
        return rep.save(user);

    }
}
