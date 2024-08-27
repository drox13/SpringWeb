package com.dario.curso.sprintboot.webapp.sprintboot_web.models;

public class User {
    private String name;
    private String lastname;
    private String address;

    public User(){}

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public User(String name, String lastname, String address) {
        this(name, lastname);
        this.address = address;
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
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
