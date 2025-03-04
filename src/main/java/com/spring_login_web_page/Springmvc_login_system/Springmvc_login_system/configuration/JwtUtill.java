package com.spring_login_web_page.Springmvc_login_system.configuration;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;

public class JwtUtill<Claims> {
    public JwtUtill jwtUtill;
    public Claims extractClaims(String token){
        return Jwt.parser()
                .vertifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayLoad();
    }
    
}
