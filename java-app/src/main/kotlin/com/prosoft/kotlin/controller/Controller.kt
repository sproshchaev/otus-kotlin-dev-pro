package com.prosoft.kotlin.controller

import com.prosoft.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController("kotlinController")
@RequestMapping("/v2")
class Controller @Autowired constructor(private val userService: UserService) {

    @GetMapping("/hello")
    fun greeting(): String {
        return "Hello, Kotlin!"
    }

    @GetMapping(value = ["/user"], params = ["id"])
    fun greetingUser(@RequestParam(name = "id") id: Long):String {
        return "Hello, ${userService.getUser(id)}!"
    }

}