package com.spring_login_web_page.Springmvc_login_system.service;

@Service
public class AdminServices {
    @AutoWired
    public AdminRepository adminrepository;
    public String getAllAdminPhoneNum(String adminPhoneNum){//Admin Phone Num Get method Declare
        return adminrepository.getAllAdminPhoneNum(adminPhoneNum);//Printing Admins' Phone Num
    }
    public String getAllNamesBYAdmin(String adminName){
        return adminrepository.getAllNamesBYAdmin(adminName);
    }
    public String getAdminPassword(String adminPassword){
        return adminrepository.getAdminPassword(adminPassword);
    }
}
