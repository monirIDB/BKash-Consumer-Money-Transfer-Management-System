/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class AgentDatabase {
    String dbpassword = "apcl123456";
    Connection cone;

    public String agentInsert(int phoneNumber, int rechargeAmount, String name, String email, String dob, String address, String license, int altNumber) {
        String isInsert = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("insert into agent(phoneNumber, rechargeAmount, name, email, dob, address,"
                    + " license, altNumber) values("+ phoneNumber + "," + rechargeAmount + ",'" + name + "','" + email + "','" + dob + "','" + address + "','" + license + "'," + altNumber + ");");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                isInsert = " Information Has Been RECORDED";
            } else {
                isInsert = "Information Not RECORDED";
            }

        } catch (ClassNotFoundException | SQLException ex) {
            isInsert +=ex;
        }
        return isInsert;
    }
    
    public static void main(String[] args) {
       AgentDatabase adb=new AgentDatabase();
       int num=1966120702;
       int amo=0;
        amo=adb.getagentAmount(num);
        System.out.println(amo);
    }
            
       public int getagentAmount(int aphoneNumber) {
        int amount =0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("select rechargeAmount from agent where phoneNumber="+aphoneNumber );
            ResultSet  res = stmnt.executeQuery();
            if(res.next()){
            amount=res.getInt("rechargeAmount");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return amount;
    }
       
     
               
               
      public boolean agentAmountUpdate(int aphoneNumber, int crechargeAmount) {
        boolean UpdateRecharge =false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("update agent set rechargeAmount=(rechargeAmount-"+crechargeAmount+") where phoneNumber="+aphoneNumber+"; ");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                UpdateRecharge = true;
            } else {
                UpdateRecharge =false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            UpdateRecharge=false;
        }
        return UpdateRecharge;
    }
      
      
      
       public boolean agentRecharge(int aphoneNumber, int arechargeAmount) {
        boolean UpdateRecharge =false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("update agent set rechargeAmount=(rechargeAmount+"+arechargeAmount+") where phoneNumber="+aphoneNumber+"; ");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                UpdateRecharge = true;
            } else {
                UpdateRecharge =false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            UpdateRecharge=false;
        }
        return UpdateRecharge;
    }
              
    
}
