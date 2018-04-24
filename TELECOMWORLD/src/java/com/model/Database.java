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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author APCL
 */


public class Database {
    String dbpassword="apcl123456";
    
    public boolean  insert(int id,String name,int b,int e,int m,int s,int g,int r,int a,double gpa, String gread){
       boolean isInsert=false;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root", dbpassword);
                PreparedStatement stmnt = cone.prepareStatement("insert into gparesult(id, name, bangla, english, math, socialscience,"
                        + " generalscience, religion, agriculture, gpa, grade) values(" + id + ",'" + name + "'," + b + 
                        "," + e + "," + m + "," + s + "," + g + "," + r + "," + a + "," + gpa + ",'" + gread + "')");
                int updat = stmnt.executeUpdate();
                if (updat > 0) {
                  isInsert=true;
                } else {
                   isInsert=false;
                }
                
            }catch(Exception ex){
         
            }
    return isInsert;
    }
    
    
    public List<GetSet>  retrive(){
      
       List<GetSet> resList = new ArrayList<GetSet>();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root",dbpassword);
                PreparedStatement stmnt = cone.prepareStatement("select * from gparesult");
                ResultSet rse = stmnt.executeQuery();
                 while(rse.next()){
                GetSet rlist = new GetSet();
                rlist.setId(rse.getInt("id"));
                rlist.setName(rse.getString("name"));
                rlist.setBangla(rse.getInt("bangla"));
                rlist.setEnglish(rse.getInt("english"));
                rlist.setMath(rse.getInt("math"));
                rlist.setSocialscience(rse.getInt("socialscience"));
                rlist.setGeneralscience(rse.getInt("generalscience")); 
                rlist.setReligion(rse.getInt("religion"));
                rlist.setAgriculture(rse.getInt("agriculture"));
                rlist.setGpa(rse.getDouble("gpa"));
                rlist.setGrade(rse.getString("grade"));
                    
                   resList.add(rlist);
                }
            }catch(ClassNotFoundException | SQLException ex){
                System.out.println(ex);
            }
        return resList;
    }
    
    
     public boolean  insertIdName(String a, String b){
       boolean isInsert=false;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root",dbpassword);
                PreparedStatement stmnt = cone.prepareStatement("insert into idname( name, password) values('" + a + "','" + b + "');");
                int updat = stmnt.executeUpdate();
                if (updat > 0) {
                  isInsert=true;
                } else {
                   isInsert=false;
                }
                
            }catch(ClassNotFoundException | SQLException ex){
         
            }
    return isInsert;
    }
    
    
    
    
    
    public List<Getter>  retriveIdName(){
      
       List<Getter> resList = new ArrayList<Getter>();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root",dbpassword);
                PreparedStatement stmnt = cone.prepareStatement("select * from idname;");
                ResultSet rse = stmnt.executeQuery();
                while(rse.next()){
                Getter rlist = new Getter();
                    rlist.setId(rse.getInt("id"));   
                    rlist.setName(rse.getString("name"));    
                    rlist.setPassword(rse.getString("password"));
                resList.add(rlist);
            }
            }catch(ClassNotFoundException | SQLException ex){
                System.out.println(ex.getMessage());
            }
        return resList;
    }
    
    
     public List<Object> rsOne(int id){
      
       List<Object> resList = new ArrayList<Object>();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root",dbpassword);
                PreparedStatement stmnt = cone.prepareStatement("select * from gparesult where id="+id);
                ResultSet rse = stmnt.executeQuery();
                while(rse.next()){
                GetSet rlist = new GetSet();
                rlist.setId(rse.getInt("id"));
                rlist.setName(rse.getString("name"));
                rlist.setBangla(rse.getInt("bangla"));
                rlist.setEnglish(rse.getInt("english"));
                rlist.setMath(rse.getInt("math"));
                rlist.setSocialscience(rse.getInt("socialscience"));
                rlist.setGeneralscience(rse.getInt("generalscience")); 
                rlist.setReligion(rse.getInt("religion"));
                rlist.setAgriculture(rse.getInt("agriculture"));
                rlist.setGpa(rse.getDouble("gpa"));
                rlist.setGrade(rse.getString("grade"));
                    
                   resList.add(rlist);
            }
            }catch(ClassNotFoundException | SQLException ex){
                System.out.println(ex.getMessage());
            }
        return resList;
    }
     
      public boolean  delete(int id){
       boolean isInsert=false;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root",dbpassword);
                PreparedStatement stmnt = cone.prepareStatement("delete from gparesult where id="+id);
                int updat = stmnt.executeUpdate();
                if (updat > 0) {
                  isInsert=true;
                } else {
                   isInsert=false;
                }
                
            }catch(ClassNotFoundException | SQLException ex){
         
            }
    return isInsert;
    }
    
}
