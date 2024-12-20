package com.paul.todo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.paul.todo.model.User;

import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "homepage/home";
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/signup")
    public String signUp() {
        return "auth/signup";
    }

    @GetMapping("/my-account")
    public String myAccount(Model model) {

        return "auth/my-account";
    }

}
