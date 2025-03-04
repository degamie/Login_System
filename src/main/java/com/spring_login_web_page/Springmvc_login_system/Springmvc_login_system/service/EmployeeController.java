// import java.util.concurrent.ExecutorCompletionService;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// @RequestMapping("api/v1/employee")
// public class EmployeeController{
//     @AutoWired 
//     public EmpService empService;
//     @PostMapping(path="save")
//     public String saveEmp(@RequestBody EmpDto empDto) {
//         String empId=empService.addEmp(empDto);
//         return empId;
//     }
// }