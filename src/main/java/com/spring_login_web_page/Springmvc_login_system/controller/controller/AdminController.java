package com.spring_login_web_page.Springmvc_login_system.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_login_web_page.Springmvc_login_system.service.AdminServices;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/admin/")
@CrossOrigin("*")
public class AdminController {
    @AutoWired
    public AdminServices adminServices;
    @GetMapping("/admin/{adminPhoneNum}")
    public String getAllAdminByPhoneNum(String PhoneNum) {
        return adminServices.getAllAdminByPhoneNum(PhoneNum);
    }
    
    @GetMapping("/admin/{adminId}")
    public String getAllIdBYAdmin(String adminId) {
        return adminServices.getAllIdBYAdmin(adminId);
    }
    

    @GetMapping("/admin/{adminName}")
    public String getAdminName(String adminName){
        return adminServices.getAllAdminName(adminName);
    }
    @GetMapping("/admin/{adminPassword}")
    public String getAdminPassword(String adminPassword){
        return adminServices.getAllAdminPassword(adminPassword);
    }
    @GetMapping("/admin/")
    public String admin() {
        return "Admin Page Logged in";
    }
    @GetMapping("/admin/{Id}")
    public String getAdminId() {
        return "User is Accessing AdminId";
    }  
    @GetMapping("/admin/{Name}")
    public String getAdminName() {
        return "vUser is Accessing AdminName";
    }

    @GetMapping("/admin/{password}")
    public String getAdminpasswrd() {
        return "User is Accessing Adminpassword";
    }   
}