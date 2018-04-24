/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.sql.Date;

/**
 *
 * @author lenovo
 */
public class cRechargeGetSet {
     private int id;
     private Date date;
     private int cphoneNumber;
     private int crechargeAmount;
     private int aphoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCphoneNumber() {
        return cphoneNumber;
    }

    public void setCphoneNumber(int cphoneNumber) {
        this.cphoneNumber = cphoneNumber;
    }

    public int getCrechargeAmount() {
        return crechargeAmount;
    }

    public void setCrechargeAmount(int crechargeAmount) {
        this.crechargeAmount = crechargeAmount;
    }

    public int getAphoneNumber() {
        return aphoneNumber;
    }

    public void setAphoneNumber(int aphoneNumber) {
        this.aphoneNumber = aphoneNumber;
    }
     
}
