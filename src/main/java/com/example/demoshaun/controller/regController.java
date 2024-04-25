package com.example.demoshaun.controller;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demoshaun.domain.Login1;
import com.example.demoshaun.service.registration;

@Controller
public class regController {
    @Autowired
    private registration service;

    @GetMapping("/registration")
    public String api() {
        return "registration";

}
@PostMapping("/reg")
public String login(@ModelAttribute("user") Login1 user) {

    Login1 oauthUser = service.saveUser(user.getUsername(), user.getPassword());

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
