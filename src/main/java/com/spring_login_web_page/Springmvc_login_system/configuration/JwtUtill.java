package com.spring_login_web_page.Springmvc_login_system.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;

public class JwtUtill<Claims> {
    @Autowired
    public JwtUtill jwtUtill;
    @Override
    public Claims extractClaims(String token){
        return Jwt.parser()
                .vertifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayLoad();
    }    
}
