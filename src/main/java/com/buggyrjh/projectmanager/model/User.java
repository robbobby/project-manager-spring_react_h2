package com.buggyrjh.projectmanager.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    private Long id;
    private String login;
//            password, passwordToCompare, firstName, lastName, emailAddress,
//    mobileNumber, mobileNumberCountryCode, addressLine1, addressLine2,
//    addressCity, addressPostCode, addressCountry;

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    private Company company;
    @OneToMany(mappedBy = "id")
    private Set<Task> tasks;
    @ManyToOne
    private Project project;

//    public User(String loginId, String password, String passwordToCompare, String firstName, String lastName,
//                String emailAddress, String mobileNumber, String mobileNumberCountryCode, String addressLine1,
//                String addressLine2, String addressCity, String addressPostCode, String addressCountry) {
//        this.loginId = loginId;
//        this.password = password;
//        this.passwordToCompare = passwordToCompare;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.emailAddress = emailAddress;
//        this.mobileNumber = mobileNumber;
//        this.mobileNumberCountryCode = mobileNumberCountryCode;
//        this.addressLine1 = addressLine1;
//        this.addressLine2 = addressLine2;
//        this.addressCity = addressCity;
//        this.addressPostCode = addressPostCode;
//        this.addressCountry = addressCountry;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//    public void setMobileNumberCountryCode(String mobileNumberCountryCode) { this.mobileNumberCountryCode = mobileNumberCountryCode; }
//    public void setPasswordToCompare(String passwordToCompare) { this.passwordToCompare = passwordToCompare; }
//    public void setAddressPostCode(String addressPostCode) { this.addressPostCode = addressPostCode; }
//    public void setAddressCountry(String addressCountry) { this.addressCountry = addressCountry; }
//    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
//    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
//    public void setAddressLine1(String addressLine1) { this.addressLine1 = addressLine1; }
//    public void setAddressLine2(String addressLine2) { this.addressLine2 = addressLine2; }
//    public void setAddressCity(String addressCity) { this.addressCity = addressCity; }
//    public void setFirstName(String firstName) { this.firstName = firstName; }
//    public void setLastName(String lastName) { this.lastName = lastName; }
//    public void setPassword(String password) { this.password = password; }
//
//    public void setLoginId(String userId) { this.loginId = userId; }
//    public String getMobileNumberCountryCode() { return mobileNumberCountryCode; }
//    public String getPasswordToCompare() { return passwordToCompare; }
//    public String getAddressPostCode() { return addressPostCode; }
//    public String getAddressCountry() { return addressCountry; }
//    public String getEmailAddress() { return emailAddress; }
//    public String getMobileNumber() { return mobileNumber; }
//    public String getAddressLine1() { return addressLine1; }
//    public String getAddressLine2() { return addressLine2; }
//    public String getAddressCity() { return addressCity; }
//    public String getFirstName() { return firstName; }
//    public String getLastName() { return lastName; }
//    public String getPassword() { return password; }
//
//    public String getLoginId() { return loginId; }

}
