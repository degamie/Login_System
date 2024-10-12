package com.spring_login_web_page.Springmvc_login_system.repository;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;
import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findByName(String username, String password);
    ApplicationUser findByAuthority(String authority);
    List<Role>getRoleByAuthority(String authority);
    List<Role>getRoleByRoleName(String roleName);
}
