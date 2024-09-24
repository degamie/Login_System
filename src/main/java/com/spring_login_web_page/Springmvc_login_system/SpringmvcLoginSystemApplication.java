package com.spring_login_web_page.Springmvc_login_system;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static jdk.internal.net.http.common.Utils.encode;
import static org.springframework.util.ClassUtils.isPresent;

//import static org.springframework.boot.SpringApplication.run;
////import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringmvcLoginSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringmvcLoginSystemApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(RoleRepository roleRepository, StringHttpMessageConverter stringHttpMessageConverter, LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        String username;String password;
        Integer userid = 0;
//        List<Integer> userid = new ArrayList<>();
        return args -> {
//            Role admin=roleRepository.save(new Role("getRoleByAuthority()"));

            Role admin=roleRepository.save(new  Role("ADMIN", AuthorityUtils.authorityListToSet(Role.roleValueToString())));
            Role user=roleRepository.save(new  Role("USER", AuthorityUtils.authorityListToSet(Role.roleValueToString())));
        };
        Set<Role> roles = new HashSet<Role>();
//        ApplicationUser admin=new ApplicationUser(1,"ADMIN",password= "mysql",);
        if(roleRepository.findByAuthority("ADMIN")!=isPresent(1))return roleRepository.findByName("ADMIN");
    }
}
//        var ref = new Object() {
//
//        };