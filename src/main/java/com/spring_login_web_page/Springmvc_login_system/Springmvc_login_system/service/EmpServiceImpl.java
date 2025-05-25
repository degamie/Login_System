package com.spring_login_web_page.Springmvc_login_system.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

// import com.spring_login_web_page.Springmvc_login_system.model.Employee;
import com.spring_login_web_page.Springmvc_login_system.repository.EmpRepository;

public class EmpServiceImpl {
    @Autowired 
    public EmpRepository EmpRepository;

    public List<EmpRepository> getAllEmpName(String EmpName){
        return EmpRepository.saveAllByEmpName(EmpName);
    }
    public List<EmpRepository> getAllEmpPassword(String EmpPassword){
        return EmpRepository.save(EmpPassword);
    }
    public List<EmpRepository>getAllEmpByPassword(String Password){
    return EmpRepository.getAllEmpByName(Password);
}
    
}
