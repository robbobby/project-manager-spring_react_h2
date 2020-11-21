package com.buggyrjh.projectmanager.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name='users')
public class User {
    @Id
    private Long id;
    private String userId, password, passwordToCompare, firstName, lastName, emailAddress,
    mobileNumber, mobileNumberCountryCode, addressLine1, addressLine2,
    addressCity, addressPostCode, addressCountry;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Company company;
    @OneToMany
    private Set<Task> tasks;
    @ManyToOne
    private Project project;

    public User(String userId, String password, String passwordToCompare, String firstName, String lastName,
                String emailAddress, String mobileNumber, String mobileNumberCountryCode, String addressLine1,
                String addressLine2, String addressCity, String addressPostCode, String addressCountry) {
        this.userId = userId;
        this.password = password;
        this.passwordToCompare = passwordToCompare;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.mobileNumberCountryCode = mobileNumberCountryCode;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressPostCode = addressPostCode;
        this.addressCountry = addressCountry;
    }

    public User() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
    public void setMobileNumberCountryCode(String mobileNumberCountryCode) { this.mobileNumberCountryCode = mobileNumberCountryCode; }
    public void setPasswordToCompare(String passwordToCompare) { this.passwordToCompare = passwordToCompare; }
    public void setAddressPostCode(String addressPostCode) { this.addressPostCode = addressPostCode; }
    public void setAddressCountry(String addressCountry) { this.addressCountry = addressCountry; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
    public void setAddressLine1(String addressLine1) { this.addressLine1 = addressLine1; }
    public void setAddressLine2(String addressLine2) { this.addressLine2 = addressLine2; }
    public void setAddressCity(String addressCity) { this.addressCity = addressCity; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPassword(String password) { this.password = password; }

    public void setUserId(String userId) { this.userId = userId; }
    public String getMobileNumberCountryCode() { return mobileNumberCountryCode; }
    public String getPasswordToCompare() { return passwordToCompare; }
    public String getAddressPostCode() { return addressPostCode; }
    public String getAddressCountry() { return addressCountry; }
    public String getEmailAddress() { return emailAddress; }
    public String getMobileNumber() { return mobileNumber; }
    public String getAddressLine1() { return addressLine1; }
    public String getAddressLine2() { return addressLine2; }
    public String getAddressCity() { return addressCity; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPassword() { return password; }

    public String getUserId() { return userId; }

}
