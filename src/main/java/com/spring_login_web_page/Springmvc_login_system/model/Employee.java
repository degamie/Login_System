import jakarta.annotation.Generated;

@Getter
@Setter
@AllArgConstructor
@NoArgConstructor
@Entity
@Table(name="Employee")
public class Employee{
    @Id
    @Generated(strategy=GeneratedValue.AUTO)
  
    public String empId;
    public String empName;
    public String empEmail;
    public String password;
    public String salary;
}