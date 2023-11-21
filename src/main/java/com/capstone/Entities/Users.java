package com.capstone.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserId;
    private String email;
    private String passWord;
    private String phoneNumber;
    private String fullName;
    private Integer gender;
    private LocalDate dob;
    private String avatar;
    private Integer roleType;

    public Users() {
    }

    public Users(Integer userId, String email, String passWord, String phoneNumber, String fullName, Integer gender, LocalDate dob, String avatar, Integer roleType) {
        UserId = userId;
        this.email = email;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.avatar = avatar;
        this.roleType = roleType;
    }

    public Users(String email, String passWord, String phoneNumber, String fullName, Integer gender, LocalDate dob, String avatar, Integer roleType) {
        this.email = email;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.avatar = avatar;
        this.roleType = roleType;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return "Users{" +
                "UserId=" + UserId +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", avatar='" + avatar + '\'' +
                ", roleType=" + roleType +
                '}';
    }
}
