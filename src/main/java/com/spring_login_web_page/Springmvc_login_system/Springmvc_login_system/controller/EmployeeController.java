import java.util.concurrent.ExecutorCompletionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_login_web_page.Springmvc_login_system.service.EmpServiceImpl;

@Controller
@RequestMapping("api/v1/employee")
public class EmployeeController{
    @Autowired 
    public EmpServiceImpl empService;
    @PostMapping(path="save")
    public String saveEmp(@RequestBody EmpDto empDto) {
        String empId=EmpServiceImpl.addEmp(empDto);
        return empId;
    }
}