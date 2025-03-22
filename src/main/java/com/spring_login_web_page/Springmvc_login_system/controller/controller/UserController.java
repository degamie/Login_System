package com.spring_login_web_page.Springmvc_login_system.controller;

import com.spring_login_web_page.springmvc_login_system.service.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
@CrossOrigin("*")


public class UserController {
    //Printing Methods
    @GetMapping("/user/req/login")
    public String AccessUserPage() {return "Login Page Is Successfully Accessed By User";}
    @GetMapping("/user/req/register")
    public String RegisterAccessUserPage() {return "Register Page Is Successfully Accessed By User";}
    @GetMapping("/user/req/signup")
    public String SignupAccessUserPage() {return "Signup Page Is Successfully Accessed By User";}

    @Autowired
    public UserServices UserService;
    @GetMapping("/User/{Id}")
    public User getAllUserId(String Id){
        return UserService.getAllUserPassword(Id);
    }
    @GetMapping("/User/{Password}")
    public String getAllUserPassword(@RequestParam String Password) {
        return UserServices.getAllUserPassword(Password);
    }
    @GetMapping("/User/{username}")
    public String getAllUsername(@RequestParam String username) {
        return UserService.getAllUsername(username);
    }
    @GetMapping("/User/{proffession}")
    public String getAllUserproffession(@RequestParam String proffession) {
        return UserService.getAllUserproffession(proffession);
    }



}
