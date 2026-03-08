package com.spring_login_web_page.Springmvc_login_system.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/")
@CrossOrigin("*")
public class AdminController {
    @GetMapping("/admin/")
    public String admin() {
        return "Admin Page Logged in";
    }
}
