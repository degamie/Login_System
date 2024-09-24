package com.spring_login_web_page.Springmvc_login_system.controller;

import com.spring_login_web_page.Springmvc_login_system.model.RegisterationDTO;
import com.spring_login_web_page.Springmvc_login_system.service.AuthenticationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")

public class AuthenticationController {
    @Autowired
    private AuthenticationalService authenticationservice;
    @Autowired
    public String registerUser(@RequestAttribute RegisterationDTO Body) {
        String username=null,password=null;
        return "Authentication User Services "+authenticationservice.registeruser(username,password);
    }
}
//String Username,@RequestParam String password,
//        return "Authentication User Services "+authenticationservice.registerUser(Body.getUsername(),Body.getPassword())