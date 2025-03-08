package com.spring_login_web_page.Springmvc_login_system.configuration;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ssl.SslBundleProperties.Key;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.codec.Decoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.webauthn.api.Bytes;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc

public class JwtokenAuthFilter {
    @Autowired 
    public Key secretKey;
    public Key Keys;
    @Autowired
    public byte[] KeyBytes;
  
    @Autowired
    public JwtokenAuthFilter jwtokenAuthFilter;
    public Key getSignInKey(){
        KeyBytes=Decoder.BASE_64.decode(secretKey);
        return Keys.hmacShaKeyFor(KeyBytes);
    }
    private String buildToken(Map<String extractClaims, UserDetails userDetails,JwtokenAuthFilter jwtokenAuthFilter2) { 
            throw new UnsupportedOperationException("Unimplemented method 'buildToken'");
}
    public String generateTokeninGamedevApp(Map<String,Object>extractClaims,UserDetails userDetails){
        return buildToken(extractClaims,userDetails,jwtokenAuthFilter);
    }


    
}
