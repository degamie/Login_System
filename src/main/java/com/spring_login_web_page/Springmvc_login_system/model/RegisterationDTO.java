package com.spring_login_web_page.Springmvc_login_system.model;

import org.springframework.security.core.userdetails.User;

public class RegisterationDTO {
    private User username,password;
    public RegisterationDTO() {
        super();
    }
    public RegisterationDTO(String username, String password) {
        super();
        password=null;
        this.username=new User(username,password,null);
//        this.username=username;
//        this.password=password;

    }
    public User getUsername() {
        return username;
    }
    public void setUsername(User username) {
        this.username = username;
    }
    public User getPassword() {
        return password;
    }
    public void setPassword(User password) {
        this.password = password;
    }
    public String toString() {
        return "Registeration Info:"+"Username:"+this.username+"Password:"+this.password;
    }


}
