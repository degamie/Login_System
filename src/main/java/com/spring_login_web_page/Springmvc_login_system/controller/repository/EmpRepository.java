package com.spring_login_web_page.Springmvc_login_system.repository;

import java.util.List;

import com.spring_login_web_page.Springmvc_login_system.model.Employee;

@Repository
public class EmpRepository extends JpaRepository<Employee,String>{
    public List<Employee>getEmpName(String EmpName); 
    public List<Employee>getEmpPassword(String Password); 
} 