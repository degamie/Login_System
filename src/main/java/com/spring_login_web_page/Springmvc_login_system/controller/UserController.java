package com.spring_login_web_page.Springmvc_login_system.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")


public class UserController {
    @GetMapping("/user")
    public String AccessUserPage() {return "User Page Is Successfully Accessed";}
}
