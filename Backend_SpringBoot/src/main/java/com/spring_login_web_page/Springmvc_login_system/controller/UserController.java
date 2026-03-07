//WID(7.3.2026)(Sarthak Mittal)#1
package com.spring_login_web_page.Springmvc_login_system.controller;
import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import com.spring_login_web_page.springmvc_login_system.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableAsync
@RestController
@RequestMapping("/user")
@CrossOrigin("*")
@Controller
public class UserController {
    @Autowired
    public  UserServices userServices;
    @GetMapping("/all")
    public String AccessUserPage() {return "User Page Is Successfully Accessed";}
    @GetMapping("/UserName")
    public List<ApplicationUser> getByUserName(String UserName){
        return  userServices.getByUserName(UserName);
    }

    @GetMapping("/saveAll/{PhoneNumber}")//Saving User's Phone Number's Input
    public String getAllByUserPhoneNumber(String PhoneNumber){
        return userServices.getAllByUserPhoneNumber(PhoneNumber);
    }

   @GetMapping("/saveAll/{Authorities]")
    public String getAllBYAuthorities(@RequestParam List<SecurityProperties.User> Authorities, @RequestBody ApplicationUser applicationUser){
        return  userServices.getAllBYAuthorities(Authorities);
    }
    @GetMapping("/saveAll/{Password}")
    public String getAllByPassword(String Password){
        return userServices.getAllByPassword(Password);
    }
    @PostMapping("/findAll/{PhoneNumber}")
    public String setAllByUserPhoneNumber(String PhoneNumber){//Retrieving PhoneNumber in Server
        return userServices.setAllByUserPhoneNumber(PhoneNumber);
    }
}
