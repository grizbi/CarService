package com.example.carservice.entity;


import javax.persistence.*;

@Entity
public class Admin {

    public Admin(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int adminID;

    String password;

    String login;


    public Admin(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
