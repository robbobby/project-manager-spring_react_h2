package com.buggyrjh.projectmanager.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import java.util.UUID;

public class User {

                // ##### Initialise member variables ##### //
    private String login, password, passwordToCompare, firstName, lastName, emailAddress,
    mobileNumber, mobileNumberCountryCode, addressLine1, addressLine2,
    addressCity, addressPostCode, addressCountry;

                        // ### Map to ORM SQL ### //
    private UUID id;
    private Company company;
    private Set<Task> tasks;
    private Project project;

                    // ##### Constructor empty and full ##### //
    public User(@JsonProperty("id") UUID id,
                @JsonProperty("login") String login) {
        this.id = id;
//    String password, String passwordToCompare, String firstName, String lastName,
//                String emailAddress, String mobileNumber, String mobileNumberCountryCode, String addressLine1,
//                String addressLine2, String addressCity, String addressPostCode, String addressCountry) {
//        this.mobileNumberCountryCode = mobileNumberCountryCode;
//        this.passwordToCompare = passwordToCompare;
//        this.addressPostCode = addressPostCode;
//        this.addressCountry = addressCountry;
//        this.emailAddress = emailAddress;
//        this.mobileNumber = mobileNumber;
//        this.addressLine1 = addressLine1;
//        this.addressLine2 = addressLine2;
//        this.addressCity = addressCity;
//        this.firstName = firstName;
//        this.password = password;
//        this.lastName = lastName;
        this.login = login;
    }

    // ##### Setters ##### //
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
    public void setLoginId(String login) { this.login = login; }
    public void setId(UUID id) { this.id = id; }

                    // ##### Getters ##### //
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
    public String getLogin() { return login; }
    public UUID getId() { return id; }

}
