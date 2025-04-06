
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee,String>{//EmplOyee repository Declare
    public List<Employee>getAllEmpById(String EmpId);//EmplOyee Id Method declare
    public List<Employee>getAllEmpByName(String EmpName);//EmpName Method declare
}
