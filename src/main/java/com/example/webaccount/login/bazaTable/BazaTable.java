package com.example.webaccount.login.bazaTable;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "user_login_parol")
public class BazaTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "users_login_id")
    private long id;

    @Column(unique = true, name = "users_login")
    private String login;

    @Column(unique = false, name = "users_parol")
    private String parol;


    public BazaTable() {
    }

    public BazaTable(long id, String login, String parol) {
        this.id = id;
        this.login = login;
        this.parol = parol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }
}
