package com.spring_login_web_page.springmvc_login_system.repository;

// import com.spring_login_web_page.springmvc_login_system.model.ApplicationUser;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    //Method Declare
    public String getAllUserproffession(String proffession);
    public User getAllUserPassword(String Password);
    public String findByUsername(String username);
    public String save();
    public User getAllUserId(Integer UserId);
    public User getAllUsername(String UserName);
    public String getAllUserByPassword(String userPassword);
    public User setUserId(Integer UserId);
}
