package com.example.demoshaun.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demoshaun.domain.Login1;
import com.example.demoshaun.service.LoginService;

@Controller
public class LoginController {
 
    @Autowired
    private LoginService service;
 
    @GetMapping("/")
    public String api()
    {
 
        return "login";
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login1 user) {
 
        Login1 oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/display";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/display")
    public String display() {
        return "display";
    }
}
