package com.spring_login_web_page.Springmvc_login_system.controller;
import java.util.concurrent.ExecutorCompletionService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_login_web_page.Springmvc_login_system.model.Employee;


@Controller
@RequestMapping("api/v1/employee")
public class EmployeeController{
    @AutoWired 
    public EmpServiceImpl empService;
    @GetMapping("/Emp/{username}")
    public Employee getAllUserByName(String Empname) {
        return empService.getAllEmpName(Empname);
    }
    @GetMapping("/Emp/{password}")
    public Employee getAllUserByPassword(String Password) {
        return empService.getAllUserByPassword(Password);
    }

    
    @PostMapping(path="save")
    public String saveEmp(@RequestBody EmpDto empDto) {
        String empId=empService.addEmp(empDto);
        return empId;
    }
}