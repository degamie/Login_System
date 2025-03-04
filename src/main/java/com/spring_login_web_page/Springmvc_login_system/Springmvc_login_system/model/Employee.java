import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
@Table(name="Employee")
public class Employee{
    @Id
    @Generated(strategy=Generated.AUTO)
    public String empId;
    public String empName;
    public String empEmail;
    public String password;
    public Integer salary;
}