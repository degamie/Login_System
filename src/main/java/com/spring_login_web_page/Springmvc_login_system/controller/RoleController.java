package com.spring_login_web_page.Springmvc_login_system.controller;

import com.spring_login_web_page.Springmvc_login_system.service.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {
    @Autowired
    public RoleServices roleServices;
    public String getAllByUserId(String UserId){return roleServices.getAllByUserId(UserId); }
}
