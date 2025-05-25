package com.spring_login_web_page.Springmvc_login_system.controller.controller;
import java.util.List;
import java.util.concurrent.ExecutorCompletionService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

// import com.spring_login_web_page.Springmvc_login_system.model.Employee;
import com.spring_login_web_page.Springmvc_login_system.service.EmpServiceImpl;


@Controller
@RequestMapping("api/v1/employee")
public class EmployeeController{
    @AutoWired 
    public EmpServiceImpl empService;
    @GetMapping("/Emp/{Password}")
    public List<empService>getAllEmpByPassword(String Password){
        return empService.getAllEmpByPassword(Password);
    }
    @GetMapping("/Emp/{role}")
    public List<empService>getAllEmpByRole(String role){
            return empService.getAllEmpByRole(role);
    }
    @GetMapping("/Emp/{Id}")
    public List<empService>getAllEmpById(String EmpId){//Empl Id getMoethod
        return empService.getAllEmpId(EmpId);//Printing Empl Id's Fetch
    }
    @GetMapping("/Emp/{username}")
    public  List<empService> getAllUserByName(String Empname) {
        return empService.getAllEmpName(Empname);
    }
    @GetMapping("/Emp/{password}")
    public  List<empService> getAllUserByPassword(String Password) {
        return empService.getAllUserByPassword(Password);
    }    
    @PostMapping(path="save")
    public  List<empService> saveEmp(@RequestBody EmpDto empDto) {
        String empId=empService.addEmp(empDto);
        return empId;
    }
}
