
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface  AuthenticationalRepository extends JpaReposiotry<User,String>{
    public List<User>findByUserName(String username);
}
