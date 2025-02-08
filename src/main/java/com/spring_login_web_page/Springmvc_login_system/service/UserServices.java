// package com.spring_login_web_page.springmvc_login_system.service;

// import com.spring_login_web_page.Springmvc_login_system.controller.UserController;
// import com.spring_login_web_page.springmvc_login_system.model.ApplicationUser;
// import com.spring_login_web_page.springmvc_login_system.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Service;

// import javax.management.relation.Role;
// import java.beans.Encoder;
// import java.util.Base64;
// import java.util.HashSet;
// import java.util.Set;


// import static org.apache.el.lang.ELArithmetic.add;

// @Service
// public class UserServices implements UserDetailsService {
//     @Autowired
//     public User user; 

//    @Autowired
//     private PasswordEncoder passwordEncoder;

//     @Autowired
//     private ApplicationUser applicationUser;

//     @Autowired
//     private  UserRepository userRepository;

//     userRepository.findByUsername();
//     if(user.isPresent()){
//         user=user.get();
//         return user.builder()
//                 .username(UserController.getUsername())
//                 .username(UserController.getPassword())
//                 .build();
                
//     }


//     @Autowired
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         throw new UsernameNotFoundException(username+ "LoadUserBYUserName");
//         System.out.println(UserDetailsService.getName());
//         if(!username.equals("Sarthak"))throw new UsernameNotFoundException(username+ "LoadUserByUsername");
//         roles=new Role(1,"USER");
//         return new ApplicationUser(1,"SARTHAK", "PASSWORD",roles);
//     }
//     Set<Role> roles=new HashSet<>();
// }
// //    @Override
// //   UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
// //        return null;
// //    }

