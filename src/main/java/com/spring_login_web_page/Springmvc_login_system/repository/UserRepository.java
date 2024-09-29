package com.spring_login_web_page.Springmvc_login_system.repository;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, String> {
    public List<String> getUserid(String userid);
    public List<String> setUserid(String userid);
}
//    public List<ApplicationUser> findByUsername(String username);
//    public List<ApplicationUser> loadUserByUsername(String username);

