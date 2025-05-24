package com.spring_login_web_page.Springmvc_login_system.controller;

import com.spring_login_web_page.springmvc_login_system.service.UserServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
@CrossOrigin("*")
@Controller

public class UserController {
    public String UserId;
    @Autowired
    public UserServices userService;
    @GetMapping("/User/{UserId}")
    public List<userService> getAllUserId(@PathVariable String UserId,@RequestBody User user){//Fetching The UserId's End Pt. Val
        return userService.getAllUserId(UserId);
    }
}
    // //Printing Methods
    // @GetMapping("/user/req/login")
    // public String AccessUserPage() {return "Login Page Is Successfully Accessed By User";}
    // @GetMapping("/user/req/register")
    // public String RegisterAccessUserPage() {return "Register Page Is Successfully Accessed By User";}
    // @GetMapping("/user/req/signup")
    // public String SignupAccessUserPage() {return "Signup Page Is Successfully Accessed By User";}


    // @GetMapping("/User/{Password}")
    // public String getAllUserPassword(@RequestParam String Password) {
    //     return UserServices.getAllUserPassword(Password);
    // }
    // @GetMapping("/User/{username}")
    // public String getAllUsername(@RequestParam String username) {
    //     return UserService.getAllUsername(username);
    // }
    // @GetMapping("/User/{proffession}")
    // public String getAllUserproffession(@RequestParam String proffession) {
    //     return UserService.getAllUserproffession(proffession);
    // }

