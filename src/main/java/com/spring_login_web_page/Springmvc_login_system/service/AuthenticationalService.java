package com.spring_login_web_page.Springmvc_login_system.service;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import com.spring_login_web_page.Springmvc_login_system.model.LoginResponseDTO;
import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import com.spring_login_web_page.Springmvc_login_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

//import static jdk.internal.icu.impl.Punycode.encode;

@Service
public class AuthenticationalService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    private String username;private String password;

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;
    private PasswordEncoder passwordEncoder;

//@Autowired
    public LoginResponseDTO loginUsername(String username, String password) {
        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (AuthenticationException e) {

        }
        return new LoginResponseDTO(null, "");
    }




//        @Autowired
        public ApplicationUser registeruser (String username, String password,PasswordEncoder passwordEncoder) {
            String password1 = passwordEncoder.encode (password) ;
//                @Override
////                public String encode(CharSequence rawPassword) {
////                    return "";
////                }
////
////                @Override
////                public boolean matches(CharSequence rawPassword, String encodedPassword) {
////                    return false;
////                }
//            }

            Role userRole = roleRepository.findByAuthority("USER").get();
            Set<Role> authorities = new HashSet<>();
            authorities.add(userRole);
            return null;
//            return userRepository.save(new ApplicationUser(0, username,passwordEncoder.encode(authorities.equals(password.contains()))));
        }
    }
