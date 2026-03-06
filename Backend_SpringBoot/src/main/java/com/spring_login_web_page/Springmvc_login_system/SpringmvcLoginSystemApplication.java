package com.spring_login_web_page.Springmvc_login_system;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
// import com.spring_login_web_page.springmvc_login_system.model.ApplicationUser;
//import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
//import org.springframework.boot.CommandLineRunner;

//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.management.relation.Role;
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.springframework.util.ClassUtils.isPresent;

//import static org.springframework.boot.SpringApplication.run;
////import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableAsync
public class SpringmvcLoginSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringmvcLoginSystemApplication.class, args);
    }
}
//    @Bean
//    public CommandLineRunner commandLineRunner(RoleRepository roleRepository) {
//        return args -> {
//            Role admin=roleRepository.save(new Role("ADMIN"));
//            Role user=roleRepository.save(new  Role("USER"));
//
//        };
//        Set<Role> roles = new HashSet<Role>();
//        ApplicationUser admin=new ApplicationUser(1,"ADMIN", PasswordEncoder.encode("Password"),roles);
//        if(roleRepository.findByAuthority("ADMIN")!=isPresent())return;
//
//
//    }


