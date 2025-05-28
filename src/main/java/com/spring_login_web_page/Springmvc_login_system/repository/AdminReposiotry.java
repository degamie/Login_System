package com.spring_login_web_page.Springmvc_login_system.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminReposiotry extends JpaRepository<Admin,String>{
    @Autowired
    public Admin admin;
    public <admin> setAllAdminBYPhoneNum(String PhoneNum);
    public List<admin>getAllAdminById(String AdminID);
    public List<admin>findAllAdminById(String AdminID);
    public List<admin> findAllNamesBYAdmin (String adminName); 
    public List<Admin>setAllNamesBYAdmin (String adminName);
    public List<admin> getAllAdminBYPhoneNum (String PhoneNum);
    public List<admin> getAllIdBYAdmin (String adminId);
    public List<admin> getAllNamesBYAdmin (String adminName);
    public List<admin> getAdminAllPassword (String adminPassword);
}
