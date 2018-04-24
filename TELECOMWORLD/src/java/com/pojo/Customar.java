/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lenovo
 */
@XmlRootElement
public class Customar {

    private int phoneNumber;
    private int rechargeAmount;
    private String name;
    private String email;
    private String dob;
    private String address;
    private String occupation;
    private int altNumber;

    public Customar() {
    }

    public Customar(int phoneNumber, int rechargeAmount, String name, String email, String dob, String address, String occupation, int altNumber) {
        this.phoneNumber = phoneNumber;
        this.rechargeAmount = rechargeAmount;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.address = address;
        this.occupation = occupation;
        this.altNumber = altNumber;
    }
    

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(int rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAltNumber() {
        return altNumber;
    }

    public void setAltNumber(int altNumber) {
        this.altNumber = altNumber;
    }
    
    
}
