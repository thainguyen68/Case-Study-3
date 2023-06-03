package com.example.casestudy3.model;

import java.sql.Date;

public class User {
    private int id;
    private String avatar;
    private String username;
    private String password;
    private String fullName;
    private String numberPhone;
    private Date dateOfBirth;
    private String favorite;
    private String address;

    public User() {
    }

    public User(String username, String password, String numberPhone, Date date_of_birth) {
        this.username = username;
        this.password = password;
        this.numberPhone = numberPhone;
        this.dateOfBirth = date_of_birth;
    }

    public User(int id, String username, String password, String numberPhone, Date date_of_birth) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.numberPhone = numberPhone;
        this.dateOfBirth = date_of_birth;
    }

    public User(int id, String avatar, String username, String password, String fullName,
                String numberPhone, Date dateOfBirth, String favorite, String address) {
        this.id = id;
        this.avatar = avatar;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.dateOfBirth = dateOfBirth;
        this.favorite = favorite;
        this.address = address;
    }

    public User(String avatar, String username, String password,
                String fullName, String numberPhone, Date dateOfBirth, String favorite, String address) {
        this.avatar = avatar;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.dateOfBirth = dateOfBirth;
        this.favorite = favorite;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date date_of_birth) {
        this.dateOfBirth = date_of_birth;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

