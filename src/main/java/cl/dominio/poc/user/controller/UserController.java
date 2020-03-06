package cl.dominio.poc.user.controller;

import cl.dominio.poc.user.model.User;
import cl.dominio.poc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@Valid @RequestBody User userRequest) {
        return userService.createUser(userRequest);
    }

}
