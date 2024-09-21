package com.spring_login_web_page.Springmvc_login_system.model;

public class LoginResponseDTO {
    private ApplicationUser user;
    private String jwt;

    public ApplicationUser getUser() {
        return user;
    }
    public LoginResponseDTO(ApplicationUser user, String jwt) {
        this.user = user;
        this.jwt = jwt;
    }
    public void setUser(ApplicationUser user) {
        this.user = user;
    }
    public String getJwt() {
        return jwt;
    }
    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}