package cl.dominio.poc.user.service;

import cl.dominio.poc.user.model.User;
import cl.dominio.poc.user.model.UserRequest;
import cl.dominio.poc.user.model.UserResponse;
import cl.dominio.poc.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponse createUser(UserRequest userRequest) {
        validateUser(userRequest);
        User user = userRepository.save(User.toEntity(userRequest));
        return User.toResponse(user);
    }

}
