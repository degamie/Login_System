package com.spring_login_web_page.Springmvc_login_system.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_login_web_page.Springmvc_login_system.service.AdminServices;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/admin/")
@CrossOrigin("*")
public class AdminController {
    @Autowired
    public AdminServices adminServices;
    @PostMapping("/admin/set/{adminName}")
        public List<Admin>setAllNamesBYAdmin (String adminName){
            return adminServices.setAllAdminByPhoneNum(adminName);
    }
    @PostMapping("/Admin/{AdminName}")
    public String setAllNameBYAdmin (String adminName){return adminServices.setAllNamesBYAdmin(adminName);}//Inseritng The AdminName Val

    public List<user>findAllAdminById(String AdminID){
        return adminrepository.findAllAdminByID(AdminID);
    }
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
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
