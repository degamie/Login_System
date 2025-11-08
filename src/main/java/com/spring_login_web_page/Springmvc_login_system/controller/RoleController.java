package com.spring_login_web_page.Springmvc_login_system.controller;

import com.spring_login_web_page.Springmvc_login_system.service.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoleController {
    @Autowired
    public RoleServices roleServices;
    public String getAllByUserId(String UserId){return roleServices.getAllByUserId(UserId); }
    @GetMapping("/saveAll/{UserPassword}")
    public String getAllByUserPassword (String UserPassword){return roleServices.getAllByUserPassword(UserPassword);}
    @GetMapping("/roles/saveAll/{UserName}")
 public String getAllByUserName(String UserName){return roleRepository.saveAllByUserName(UserName);}
    @GetMapping("/saveAll/{authority}")
    public String getAllByauthority(String authority){return roleServices.getAllByauthority(authority);}
    @GetMapping("/saveAll/{PhoneNumber}")//Fetching PhoneNumber in Server
    public String getAllPhoneNumber(String PhoneNumber){
        return roleServices.getAllPhoneNumber(PhoneNumber);
    }
    
}
