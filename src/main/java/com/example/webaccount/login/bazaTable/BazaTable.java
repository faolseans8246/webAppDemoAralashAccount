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

    @Column(name = "users_login")
    public String logins;

    @Column(name = "users_parol")
    public String parol;


    public BazaTable() {
    }

    public BazaTable(String logins, String parol) {
        this.logins = logins;
        this.parol = parol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogins() {
        return logins;
    }

    public void setLogins(String logins) {
        this.logins = logins;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }
}
