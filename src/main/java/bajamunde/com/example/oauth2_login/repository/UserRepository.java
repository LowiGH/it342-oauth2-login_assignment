package bajamunde.com.example.oauth2_login.repository;

import bajamunde.com.example.oauth2_login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
