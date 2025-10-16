package bajamunde.com.example.oauth2_login.service;

import bajamunde.com.example.oauth2_login.model.User;
import bajamunde.com.example.oauth2_login.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User save(User user) {
        return repo.save(user);
    }
}
