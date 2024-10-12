package com.spring_login_web_page.Springmvc_login_system.controller;

import com.spring_login_web_page.Springmvc_login_system.service.AuthenticationalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")

@Controller
public class AuthenticationController {
//    @Autowired
    public AuthenticationalService authenticationalservice;
//    @Autowired
    @PostMapping("/registerUser")
    public String registerUser(@RequestAttribute String username,@RequestAttribute String password) {
//        String username=null,password=null;
        return " User Details to Be Registerd "+authenticationalservice.registeruser(username,password);
    }
    @GetMapping("/registerUser")
    public String getUser(@RequestAttribute String username,@RequestAttribute String password) {
//        String username=null,password=null;
        return "User Details Page!:"+authenticationalservice.registeruser(username,password);
    }
}
//String Username,@RequestParam String password,
//        return "Authentication User Services "+authenticationservice.registerUser(Body.getUsername(),Body.getPassword())