package com.spring_login_web_page.Springmvc_login_system.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AdminReposiotry extends JpaRepository<Admin,String>{
    public void setAllAdminBYPhoneNum(String PhoneNum);
    public List<Admin>getAllAdminById(String AdminID);
    public List<user>findAllAdminById(String AdminID);
    public List<Admin> findAllNamesBYAdmin (String adminName); 
    public List<Admin>setAllNamesBYAdmin (String adminName);
    public List<Admin> getAllAdminBYPhoneNum (String PhoneNum);
    public List<Admin> getAllIdBYAdmin (String adminId);
    public List<Admin> getAllNamesBYAdmin (String adminName);
    public List<Admin> getAdminAllPassword (String adminPassword);
}
