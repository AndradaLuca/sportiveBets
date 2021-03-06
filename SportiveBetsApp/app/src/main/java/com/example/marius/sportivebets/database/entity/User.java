package com.example.marius.sportivebets.database.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "User", indices = {@Index(value = {"CNP"}, unique = true)})
public class User {


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "CNP")
    private String CNP;

    @ColumnInfo(name = "Name")
    private String name;

    @ColumnInfo(name = "Email")
    private String mail;

    @ColumnInfo(name = "Address")
    private String address;

    @ColumnInfo(name = "Password")
    private String password;

    @ColumnInfo(name = "Ammount")
    private double mouney;

    public User() {
    }


    public User(@NonNull String CNP, @NonNull String name, @NonNull String mail, @NonNull String address, @NonNull String password, @NonNull double mouney) {
        this.CNP = CNP;
        this.name = name;
        this.mail = mail;
        this.address = address;
        this.password = password;
        this.mouney = mouney;
    }


    @NonNull
    public String getCNP() {
        return CNP;
    }

    public void setCNP(@NonNull String CNP) {
        this.CNP = CNP;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getMail() {
        return mail;
    }

    public void setMail(@NonNull String mail) {
        this.mail = mail;
    }

    @NonNull
    public String getAddress() {
        return address;
    }

    public void setAddress(@NonNull String address) {
        this.address = address;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public double getMouney() {
        return mouney;
    }

    public void setMouney(@NonNull double mouney) {
        this.mouney = mouney;

    }

    @Override
    public String toString() {
        return "User{" +
                "CNP='" + CNP + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", mouney=" + mouney +
                '}';
    }
}
