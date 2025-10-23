package com.spring_login_web_page.Springmvc_login_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    public String findAllByUserId(String UserId);
    public String saveAllByUserId(String UserId);
    public String saveAllByUserPassword(String UserPassword);
    Optional<Role> findByName(String name);
    public String saveAllByUserName(String UserName);
    Optional<Role> findByAuthority(String authority);
}
