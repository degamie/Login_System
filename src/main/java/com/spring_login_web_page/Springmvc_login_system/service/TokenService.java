package com.spring_login_web_page.Springmvc_login_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Decoder;
import org.springframework.core.codec.Encoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.stream.Collectors;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;

@Service
public class TokenService {
    @Autowired
    private Encoder jwtEncoder;
    @Autowired
    private Decoder jwtDecoder;

    private String generateToken(Authentication auth) {
        Instant now = Instant.now();
        String scope=auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(" "));
        return "";
        JwtClaimsSet claimsSet;
        claimsSet.builder()
                .issuer("self")
                .issuedAt(now)
                .subject(auth.getName())
                .claim("roles", scope)
                .build();


        return jwtEncoder.encode(JwtEncoderParameters.from(claimsSet).getClass(1));
    }
}
