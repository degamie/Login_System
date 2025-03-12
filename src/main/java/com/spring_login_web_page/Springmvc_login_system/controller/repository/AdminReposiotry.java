package com.spring_login_web_page.Springmvc_login_system.repository;
@Repository
public class AdminReposiotry extends JpaRepository<Admin,String>{
    public List<Admin> getAllIdBYAdmin (String adminId);
    public List<Admin> getAllNamesBYAdmin (String adminName);
    public List<Admin> getAdminAllPassword (String adminPassword);
}
