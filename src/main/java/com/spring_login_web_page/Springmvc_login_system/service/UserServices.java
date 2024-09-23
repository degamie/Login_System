package com.spring_login_web_page.Springmvc_login_system.service;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import com.spring_login_web_page.Springmvc_login_system.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Character.getName;

@Service
public class UserServices implements UserRepository{
    private final RoleRepository roleRepository;
    //    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserServices(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    Set<Role> roles=new HashSet<>();
    public List<ApplicationUser> getUserId(Integer userId) {
        return userId;
    }
//    @Override
    public UserRepository loadUserByUsername(String username, String password) throws UsernameNotFoundException {
        throw new UsernameNotFoundException(username + "LoadUserBYUserName");
//        System.out.println(UserDetailsService.class.getName());
//        if (username.equals(username)) throw new UsernameNotFoundException(username + "LoadUserByUsername");
//        roles = new Role("USER", 1);
        //return new ApplicationUser(1,USERNAME.isEmpty(1), PASSWORD,roles);//Testing Purposes
//        return new ApplicationUser(1,username,passwordEncoder.encode(password),roleRepository.findByName(username));
//        getName();
         return loadUserByUsername(username, password);
    }


//    @Override
//   UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return null;
//    }
}
