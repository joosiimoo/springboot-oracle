package com.example.web.domain;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1;

    private Long id_user;
    private String login;
    private String email;
    private String name;
    private String type;
    private String passwd;
    private String passwd_old;
    private String active;

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswd_old() {
        return passwd_old;
    }

    public void setPasswd_old(String passwd_old) {
        this.passwd_old = passwd_old;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

}
