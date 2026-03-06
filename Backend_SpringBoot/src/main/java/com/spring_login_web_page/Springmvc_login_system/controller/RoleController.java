//WID(6/3/2026)(Sarthak Mittal)#1
package com.spring_login_web_page.Springmvc_login_system.controller;

import com.spring_login_web_page.Springmvc_login_system.service.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Role;
import java.util.List;
@EnableAsync
@RestController
@RequestMapping("/role")
@Controller
public class RoleController {
    @Autowired
    public RoleServices roleServices;
    public String getAllByUserId(String UserId){return roleServices.getAllByUserId(UserId); }
    @GetMapping("/saveAll/{UserPassword}")
    public String getAllByUserPassword (String UserPassword){return roleServices.getAllByUserPassword(UserPassword);}
    @GetMapping("/roles/saveAll/{UserName}")
 public String getAllByUserName(String UserName){return roleServices.saveAllByUserName(UserName);}
    @GetMapping("/saveAll/{authority}")
    public String getAllByauthority(String authority){return roleServices.getAllByauthority(authority);}
    @GetMapping("/saveAll/{PhoneNumber}")//Fetching PhoneNumber in Server
    public String getAllPhoneNumber(String PhoneNumber){
        return roleServices.getAllPhoneNumber(PhoneNumber);
    }
    @GetMapping("/roleName")
    public List<Role> getByRoleName(String roleName){
        return roleServices.getByRoleName(roleName);
    }

}

