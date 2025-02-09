package com.spring_login_web_page.Springmvc_login_system.model;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
    UserDetails getUserByUserName(String username)throws UsernameNotFoundException;
}