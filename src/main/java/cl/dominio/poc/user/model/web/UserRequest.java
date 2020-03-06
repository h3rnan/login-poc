package cl.dominio.poc.user.model.web;

import java.io.Serializable;
import java.util.List;

public class UserRequest implements Serializable {

    private static final long serialVersionUID = -3420598289900817942L;

    private String name;
    private String email;
    private String password;
    private List<PhoneRequest> phones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<PhoneRequest> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneRequest> phones) {
        this.phones = phones;
    }

}
