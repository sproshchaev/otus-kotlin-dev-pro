package com.prosoft.java.controller;

import com.prosoft.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

    private final UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String greeting() {
        return "Hello, Java!";
    }

    @GetMapping(value = "/user", params = "id")
    public String greetingUser(@RequestParam(name = "id") Long id) {
        return String.format("Hello, %s!", userService.getUser(id));
    }

}
