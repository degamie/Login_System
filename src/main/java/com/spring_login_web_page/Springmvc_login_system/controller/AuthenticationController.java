package com.spring_login_web_page.Springmvc_login_system.controller;

import javax.imageio.spi.RegisterableService;
import javax.swing.text.PasswordView;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import com.spring_login_web_page.Springmvc_login_system.model.RegisterationDTO;
import com.spring_login_web_page.Springmvc_login_system.service.AuthenticationalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.PostMapping;


@Configuration
@RestController
@RequestMapping("/auth")
@CrossOrigin("*")

public class AuthenticationController {
    @Autowired
    private AuthenticationalService authenticationservice;
    @Autowired
    public ApplicationUser registerUser(@RequestBody RegisterationDTO Body) {
        return "Authentication User Services "+authenticationservice.registerUser(Body.getUsername(),Body.getPassword())

        }
        @PostMapping("/User/auth/Admin")

        public ResponseEntity<?,?> authenticateUser(@RequestBody @valid AuthenticationalService authenticationservice){
            Authentication Authentication=AuthenticationManager.authenticate(new UserName,Password AuthenticationToken(RegisterableService.getUsername(),RegsiterbleService.getPassword()));
        } 
    }
