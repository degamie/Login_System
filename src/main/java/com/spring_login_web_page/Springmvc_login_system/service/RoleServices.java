package com.spring_login_web_page.Springmvc_login_system.service;

import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
    public class RoleServices {
        @Autowired
        public RoleRepository roleRepository;
        public String getAllByUserId(String UserId){return roleRepository.saveAllByUserId(UserId); }
     public String getAllByUserPassword (String UserPassword){return roleRepository.saveAllByUserPassword(UserPassword);}
}
