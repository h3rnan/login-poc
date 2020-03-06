package cl.dominio.poc.user.service;

import cl.dominio.poc.user.model.User;
import cl.dominio.poc.user.model.web.UserRequest;
import cl.dominio.poc.user.model.web.UserResponse;
import cl.dominio.poc.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User userRequest) {
        //validateUser(userRequest);
        return userRepository.save(userRequest);
    }

    private void validateUser(UserRequest userRequest) {

    }

}
