//WID(28/03/2026)(Sarthak Mittal)#1.1.1.1.1
package com.spring_login_web_page.Springmvc_login_system.repository;


import com.spring_login_web_page.Springmvc_login_system.model.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, String> {
    public List<ApplicationUser>existsByPassword(String Password);//Chekcing User's Password in App
    public List<ApplicationUser>updateByPassword(String Password);
    public List<ApplicationUser>findByPassword(String Password);
    public List<ApplicationUser> existsByAuthority(String authority);
    public List<ApplicationUser> updateByAuhtority(String authority);
    public List<ApplicationUser> findByAuthority(String authority);
    public List<ApplicationUser> findByUserName(String UserName);
    public List<ApplicationUser> getUserId(Integer UserId);
    public List<ApplicationUser>setUserId(Integer UserId);
    public List<ApplicationUser>saveByUsername(String username);
    public String saveAllBYAuthorities(List<SecurityProperties.User>Authorities);
    public List<ApplicationUser>getUsername(String UserName);
    public String saveAllByPassword(String Password);
    public void findAllByUserPhoneNumber(String PhoneNumber);
    public String saveAllByUserPhoneNumber(String PhoneNumber);//Fetching User's Phone Number in Server
    public String saveAllByUserEmail(String USerEmail);//Fetching UserEmail in Server


}
