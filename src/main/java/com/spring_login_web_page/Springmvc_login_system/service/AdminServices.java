package com.spring_login_web_page.Springmvc_login_system.service;

import org.springframework.stereotype.Service;

import com.spring_login_web_page.Springmvc_login_system.repository.AdminReposiotry;

@Service
public class AdminServices {
    @AutoWired
    public AdminReposiotry adminrepository;
    public String getAllAdminBYPhoneNum(String PhoneNum){
        return adminrepository.getAllAdminBYPhoneNum(PhoneNum);
    }
    public String getAllIdBYAdmin(String AdminId){
        return adminrepository.getAllIdBYAdmin(AdminId);
    }
    public String getAllNamesBYAdmin(String adminName){
        return adminrepository.getAllNamesBYAdmin(adminName);
    }
    public String getAdminPassword(String adminPassword){
        return adminrepository.getAdminPassword(adminPassword);
    }
}
