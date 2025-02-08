@Getter
@Setter
@AllArgConstructor
@NoArgConstructor
@Entity
@Table(name="Employee")
public class Employee{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
  
    public String empId;
    public String empName;
    public String empEmail;
    public String password;
    public String salary;
}