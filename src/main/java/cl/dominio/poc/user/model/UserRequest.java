package cl.dominio.poc.user.model;

import java.io.Serializable;

public class UserRequest implements Serializable {

    private String name;
    private String email;
    private String password;
    private PhoneRequest phones;
}
