package com.spring_login_web_page.Springmvc_login_system.service;

import org.springframework.core.codec.Decoder;
import org.springframework.core.codec.Encoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.stream.Collectors;

@Service
public class TokenService {
    //@Autowired
    private Encoder jwtEncoder;
//        @Autowired
    private Decoder jwtDecoder;

    private JwtClaimsSet generateToken(Authentication auth) {
        Instant now = Instant.now();
        String scope=auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(" "));
//        return "";
        JwtClaimsSet claimsSet = null;
        claimsSet.builder()
                .issuer("self")
                .issuedAt(now)
                .subject(auth.getName())
                .claim("roles", scope)
                .build();
        return claimsSet;
//        reactor.core.publisher.Flux encode = jwtEncoder.encode(claimsSet);
//        return encode;

//        return jwtEncoder.encode(jwtEncoder.encode(generateToken()));
    }
}
