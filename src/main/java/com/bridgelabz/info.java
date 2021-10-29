package com.bridgelabz;

/**
 * Hello world!
 */
public class info {
    private String firstName;
    private String lastName;
    private String add;
    private String city;
    private String state;
    private String pineCode;
    private String phoneNumber;
    private String emailID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPineCode() {
        return pineCode;
    }

    public void setPineCode(String pineCode) {
        this.pineCode = pineCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public info getAllDetails() {
        return this;
    }

    public void setAllDetails(String firstName, String lastName, String add, String city, String state, String pineCode, String phoneNumber, String emailID) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAdd(add);
        this.setCity(city);
        this.setState(state);
        this.setPineCode(pineCode);
        this.setPhoneNumber(phoneNumber);
        this.setEmailID(emailID);
    }
}
