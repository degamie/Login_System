package com.spring_login_web_page.Springmvc_login_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
    Optional<Role> findByAuthority(String authority);
}
