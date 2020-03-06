package cl.dominio.poc.user.model.web;

import java.io.Serializable;

public class PhoneRequest implements Serializable {

    private static final long serialVersionUID = -1979361278989911857L;

    private Integer phoneNumber;
    private Integer cityCode;
    private Integer countryCode;

}
