package com.example.ormsample;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class UserModel {

    @Id
    private long id;
    private double price;
    private Date date;

    public UserModel() {
    }


    public UserModel(double price, Date date) {
        this.price = price;
        this.date = date;
    }
    public UserModel(Date date) {
        this.date = date;
    }

    public UserModel(double price) {
        this.price = price;
    }

    public UserModel(long id, double price, Date date) {
        this.id = id;
        this.price = price;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
