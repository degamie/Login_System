package com.spring_login_web_page.Springmvc_login_system.service;


import com.spring_login_web_page.Springmvc_login_system.repository.src.main.java.com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

@Service
    public class RoleServices {
        @Autowired
        public RoleRepository roleRepository;
        public String getAllByUserId(String UserId){return roleRepository.saveAllByUserId(UserId); }
     public String getAllByUserPassword (String UserPassword){return roleRepository.saveAllByUserPassword(UserPassword);}
         public String getAllByUserName(String UserName){return roleRepository.saveAllByUserName(UserName);}
     public String getAllByauthority(String authority){return roleRepository.saveAllByauthority(authority);}
     public String getAllPhoneNumber(String PhoneNumber){
            return roleRepository.saveAllPhoneNumber(PhoneNumber);
     }
    public List<Role>  getByRoleName(String roleName){
        return roleRepository.findByRoleName(roleName);
    }
}
