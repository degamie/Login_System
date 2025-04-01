package com.spring_login_web_page.Springmvc_login_system.repository;

import java.util.List;

@Repository
public class AdminReposiotry extends JpaRepository<Admin,String>{
    public List<user>findAllAdminById(String AdminID);
    public List<Admin> findAllNamesBYAdmin (String adminName); 
    public List<Admin>setAllNamesBYAdmin (String adminName);
    public List<Admin> getAllAdminBYPhoneNum (String PhoneNum);
    public List<Admin> getAllIdBYAdmin (String adminId);
    public List<Admin> getAllNamesBYAdmin (String adminName);
    public List<Admin> getAdminAllPassword (String adminPassword);
}
