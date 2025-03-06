package com.spring_login_web_page.Springmvc_login_system.controller;

import com.spring_login_web_page.springmvc_login_system.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
@CrossOrigin("*")


public class UserController {
    @Autowired
    public UserServices UserService;
    @GetMapping("/User/{Password}")
    public String getAllUserPassword(@RequestParam String Password) {
        return UserService.getAllUserPassword(Password);
    }
    @GetMapping("/User/{username}")
    public String getAllUsername(@RequestParam String username) {
        return UserService.getAllUsername(username);
    }
    @GetMapping("/user/req/login")
    public String AccessUserPage() {return "Login Page Is Successfully Accessed By User";}
    @GetMapping("/user/req/register")
    public String RegisterAccessUserPage() {return "Register Page Is Successfully Accessed By User";}
    @GetMapping("/user/req/signup")
    public String SignupAccessUserPage() {return "Signup Page Is Successfully Accessed By User";}

}
