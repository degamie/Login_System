package com.spring_login_web_page.Springmvc_login_system.service;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import com.spring_login_web_page.Springmvc_login_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

import static jdk.internal.icu.impl.Punycode.encode;

@Service
public class AuthenticationalService {
//    @Autowired
    private UserRepository userRepository;
//    @Autowired
    private RoleRepository roleRepository;
//    @Autowired
    ApplicationUser register(String username, String password) {
        Object encodedpassword = PasswordEncoder.encode(password);
        return null;

    Role userRole=roleRepository.findByAuthority("USER").get();
    Set<Role> authorities=new HashSet<>();
    authorities.add(userRole);
    return userRepository.save(new ApplicationUser(0,username,encode(authorities)));
    }
}
