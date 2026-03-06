package com.spring_login_web_page.Springmvc_login_system.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AdminReposiotry extends JpaRepository<Admin,String>{
    public String getAllAdminById(Long AdminID);
    public String findAllAdminById(Long AdminID);
    public String saveAllAdminById(Long AdminId);
    public String setAllAdminBYPhoneNum(String PhoneNum);
    public String findAllNamesBYAdmin (String adminName); 
    public String setAllNamesBYAdmin (String adminName);
    public String getAllAdminBYPhoneNum (String PhoneNum);
    public String getAllIdBYAdmin (String adminId);
    public String getAllNamesBYAdmin (String adminName);
    public String getAdminAllPassword (String adminPassword);
}
