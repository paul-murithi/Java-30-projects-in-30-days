package com.paul.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

}
