package com.spring_login_web_page.Springmvc_login_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring_login_web_page.Springmvc_login_system.repository.AdminReposiotry;

@Service
public class AdminServices {
    @AutoWired
    public AdminReposiotry adminrepository;
    public List<user>findAllAdminById(String AdminID){
        return adminrepository.findAllAdminByID(AdminID)
    }
        public List<Admin>setAllNamesBYAdmin (String adminName){
            return adminrepository.findAllNamesBYAdmin(String adminName);
        }
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
