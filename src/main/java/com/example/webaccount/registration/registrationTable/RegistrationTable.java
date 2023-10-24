package com.example.webaccount.registration.registrationTable;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "registration_users")
public class RegistrationTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_id", unique = true)
    private long id;

    @Column(unique = true, name = "user_email")
    private String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_confirm_password")
    private String confirm_password;


    public RegistrationTable() {
    }

    public RegistrationTable(long id, String email, String password, String confirm_password) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

}
