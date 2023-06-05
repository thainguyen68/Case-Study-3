package com.example.casestudy3.model;

import java.time.LocalDate;

public class User {
    private int id;
    private String avatar;
    private String username;
    private String password;
    private String fullName;
    private String numberPhone;
    private LocalDate dateOfBirth;
    private String favorite;
    private String address;

    public User() {
    }


    public User(int id, String avatar, String username, String password, String fullName,
                String numberPhone, LocalDate dateOfBirth, String favorite, String address) {
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
                String fullName, String numberPhone, LocalDate dateOfBirth, String favorite, String address) {
        this.avatar = avatar;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.dateOfBirth = dateOfBirth;
        this.favorite = favorite;
        this.address = address;
    }

    public User(String avatar, String fullName, LocalDate dateOfBirth, String numberPhone, String favorite, String address) {
        this.avatar = avatar;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.dateOfBirth = dateOfBirth;
        this.favorite = favorite;
        this.address = address;
    }

    public User( int id,String password) {
        this.id=id;
        this.password = password;
    }

    public User(int id, String avatar, String fullName, LocalDate dateOfBirth, String numberPhone, String favorite, String address) {
        this.id = id;
        this.avatar = avatar;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate date_of_birth) {
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

