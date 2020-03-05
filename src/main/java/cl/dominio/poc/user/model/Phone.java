package cl.dominio.poc.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PHONES")
public class Phone {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_USER", nullable = false)
    private User user;

    @Column(name = "PHONE_NUMBER", nullable = false)
    private Long phoneNumber;

    @Column(name = "CITY_CODE", nullable = false)
    private Integer cityCode;

    @Column(name = "COUNTRY_CODE", nullable = false)
    private Integer countryCode;

    public Phone(User user, Long phoneNumber, Integer cityCode, Integer countryCode) {
        this.user = user;
        this.phoneNumber = phoneNumber;
        this.cityCode = cityCode;
        this.countryCode = countryCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

}
