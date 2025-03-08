package com.spring_login_web_page.Springmvc_login_system.service;

import com.spring_login_web_page.Springmvc_login_system.model.Employee;
import com.spring_login_web_page.Springmvc_login_system.repository.EmpRepository;

public class EmpServiceImpl {
    @AutoWired 
    public EmpRepository EmpRepository;

    public Employee getAllEmpName(String EmpName){
        return EmpRepository.save(EmpName);
    }
    public Employee getAllEmpPassword(String EmpPassword){
        return EmpRepository.save(EmpPassword);
    }
    
}
