package com.spring_login_web_page.Springmvc_login_system.service;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.spring_login_web_page.Springmvc_login_system.repository.AdminReposiotry;

@Service
public class AdminServices {
    @AutoWired
    public AdminReposiotry adminrepository;
        public String getAllAdminById(String AdminID){
            return adminrepository.saveAllAdminById(AdminID);
        }
    public String findAllAdminById(String AdminID){
        return adminrepository.findAllAdminByID(AdminID);
    }
        public String setAllNamesBYAdmin (String adminName){
            return adminrepository.findAllNamesBYAdmin(String adminName);
        }
    public String setAllAdminBYPhoneNum(String PhoneNum){
        return adminrepository.findAllAdminBYPhoneNum(PhoneNum);
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
