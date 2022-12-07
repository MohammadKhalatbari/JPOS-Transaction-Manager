package org.jpos.entity;


import java.util.Date;


public class Persons {

    private Long id;

    private String name;

    private String lastname;

    private String internationalCode;

    private Date birthday;

    private String phoneNumber;

    private Boolean userStatus;

    public Persons() {
    }

    public Persons(Long id, String name, String lastname, String internationalCode, Date birthday, String phoneNumber, Boolean userStatus) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.internationalCode = internationalCode;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.userStatus = userStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }
}
