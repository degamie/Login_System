package com.spring_login_web_page.Springmvc_login_system;

import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import java.util.List;

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
    public CommandLineRunner commandLineRunner(RoleRepository roleRepository, StringHttpMessageConverter stringHttpMessageConverter, LocalContainerEntityManagerFactoryBean entityManagerFactory, List<Boolean> User) {
        String username = "";String password;
        Integer userid = 0;
//        List<Integer> userid = new ArrayList<>();
        return args -> {

            //Testing
//            Role admin=roleRepository.wait(new Role(roleRepository.getRoleByRoleName(String.valueOf((User.add(username.equals(userid)))).toUpperCase(Locale.ROOT))));
//
//            Role admin=roleRepository.save(new  Role("ADMIN", AuthorityUtils.authorityListToSet(Role.equals(username.lines()))));
//            Role user=roleRepository.save(new  Role("USER", AuthorityUtils.authorityListToSet(Role.equals(username.equals(password='admin')))));
        };
//        Set<Role> roles = new HashSet<Role>();
//        ApplicationUser admin=new ApplicationUser(1,"ADMIN",password= "mysql",);
//
//        //Testing
//        if(roleRepository.findByAuthority("ADMIN")){
//            return (CommandLineRunner) roleRepository.findByName("ADMIN","mysql");
//        }
    }
}
//        var ref = new Object() {
//
//        };