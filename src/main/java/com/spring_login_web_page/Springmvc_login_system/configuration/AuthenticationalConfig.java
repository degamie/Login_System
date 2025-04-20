
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import com.spring_login_web_page.Springmvc_login_system.configuration.SecurityConfiguration;

@EnableWebSecurity
@SecurityConfiguration
public class AuthenticationalConfig extends SecurityConfiguration<String,User>{
    @Autowired
    public SecurityConfiguration securityConfiguration;
    public void configure(HttpSecurity HttpSecurity)throws Exception{
        HttpSecurity.authorizeHttpRequests()
        .mvcMatchers(HttpMethods.GET,"/api/menu/items**")
        .permintAll()
        .anyRequest().and()
        .cors()
        .configurationsource()
        .and()
        .oauth2ResourceServer()
        .jwt()
        .decoder(jwtDecoder());
    }
    public AuthenticationalConfig(int token){
        this.token=token;
    }
    public AuthenticationSecurity authorizeFilterChain(HttpSecurity http){
        http.authorizeHttpRequests(authorized->authorized.anyRequest().authenticated());
    }
}
    
