// package com.spring_login_web_page.Springmvc_login_system.configuration;

// import com.fasterxml.jackson.databind.ser.std.DateSerializer;
// import com.spring_login_web_page.Springmvc_login_system.model.UserDetailsService;
// import com.spring_login_web_page.Springmvc_login_system.service.UserServices;
// import com.spring_login_web_page.springmvc_login_system.service.UserServices;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.ProviderManager;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// import static javax.management.Query.and;

// import static org.hibernate.boot.model.process.spi.MetadataBuildingProcess.build;

// import java.beans.BeanProperty;
// import java.util.Map;

// import org.springframework.security.config.http.SessionCreationPolicy;


// @Configuration
// @EnableWebSecurity
// public class SecurityConfiguration {
    
//     @Autowired
//     private UserServices userServices;

//     PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
//     public void createToken(Map<String,Object>claims,String subject){
//         return Jwts.builder()
//                 .claims(claims)
//                 .subject(subject)
//                 .header()
//                 .empty()
//                 .add("Typ","JWTs")
//                 .and()
//                 .issuedAt()
//                 .expiration(new Date(System.currentTimeMillis()+10000*60*50))
//                 .compact()
//     }

//     @Bean
//     public UserDetailsService userdetailsservice(){return userdetailsservice();}

//     @Bean
//     public AuthenticationProvider AuthenticationProvider(){DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
//     daoAuthenticationProvider.setUserDetailsService(userdetailsservice(username));
// }

//     //return AuthenticationProvider();}
//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         return http
//                 .csrf(csrf->csrf.disable())
//                 .formLogin(httpForm->{
//                     httpForm.LoginPage("/login").permitAll()
//                     .authorizeHttpRequests(registery->{
//                     registers.registeryMatchers("/req/signup","/css/**,/jss/**").authorizeHttpRequests(auth-> auth.anyRequest())}).permitAll().build();
                
                            
//     }
// }   


//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         return http.csrf(csrf->csrf.disable())
//                 .authorizeRequests(auth->auth.requestMatchers("/auth*").permitAll())
//                 .build();

//     }


//     @Bean
//     public AuthenticationManager authenticationManager() throws Exception {
//         DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//         daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//         return new ProviderManager(daoAuthenticationProvider);
//     }
  
//     // public SecurityFi
//     public void configure(HttpSecurity httpSecurity)throws Exception{
//         httpSecurity    
//                     .csrf().disable()
//                     .cors().disable()
//                     .authorizeHttpRequests(null)
//                     .antMatchers("/login","register/{user}").permitAll()
//                     .session()
//                     .sessionManagement()
//                     .and()
//                     .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                     return httpSecurity; 
                    

//     }

// }