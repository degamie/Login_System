package com.spring_login_web_page.Springmvc_login_system.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")


public class UserController {
    @GetMapping("/user/req/login")
    public String AccessUserPage() {return "Login Page Is Successfully Accessed By User";}
    @GetMapping("/user/req/register")
    public String RegisterAccessUserPage() {return "Register Page Is Successfully Accessed By User";}
    @GetMapping("/user/req/signup")
    public String SignupAccessUserPage() {return "Signup Page Is Successfully Accessed By User";}

}
