package com.spring_login_web_page.Springmvc_login_system.repository;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, String> {
    public List<String> registeruser(String username, String password);
    Optional<ApplicationUser> findUserByUsername(String username);
    Optional<ApplicationUser>findUserBypassword(String password);
    Optional<ApplicationUser>findUserById(String id);
    public Optional<User> getUserid(String userid);
    public Optional<User> setUserid(String userid);
    public List<String> getUserById(String userid);
    public List<String> getUserByusername(String username);
    public List<User> getAllUsers();
    public List<ApplicationUser> getAllUsersByRole(String role);




}
//    public List<ApplicationUser> findByUsername(String username);
//    public List<ApplicationUser> loadUserByUsername(String username);

