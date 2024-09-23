package com.spring_login_web_page.Springmvc_login_system.configuration;

import com.spring_login_web_page.Springmvc_login_system.repository.UserRepository;
import com.spring_login_web_page.Springmvc_login_system.service.UserServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfiguration {
    private UserServices userServices;

    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return new ProviderManager(daoAuthenticationProvider);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, UserRepository userRepository) throws Exception {
        return http
                .csrf(csrf->csrf.disable())
//                .httpBasic()
//                .and()
                .authorizeHttpRequests(auth-> auth.anyRequest())
//                .oauth2ResourceServer(userServices.loadUserByUsername())
//                .oauth2ResourceServer(<http>UserServices::loadUserByUsername(username))
//        oAuth2ResourceServerAutoConfiguration(userRepository.loadUserByUsername(username))
//               .oauth2ResourceServer(userServices::UserRepository.loadUserByUsername()))

                .build();

    }
    public HttpSecurity filterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf->csrf.disable())
                .authorizeRequests(auth->auth.requestMatchers("/auth*").permitAll())
                .oauth2ResourceServer((oauth2) -> oauth2.jwt(Customizer.withDefaults()));
//        .SessionCreationPolicy.STATELESS;
//                .build();

    }


}
