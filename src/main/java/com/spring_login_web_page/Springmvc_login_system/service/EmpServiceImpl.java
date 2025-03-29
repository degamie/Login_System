package com.spring_login_web_page.Springmvc_login_system.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpServiceImpl {//EmpServiceImpl Class Declare
    @Autowired
    public EmpServiceImpl empServiceImpl;//Obj declare
        public List<Employee>getAllEmpById(String EmpId){//EmplOyeeId Service impl
        return empService.getAllEmpId(EmpId);
    }
}
