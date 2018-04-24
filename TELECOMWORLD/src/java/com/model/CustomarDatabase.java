/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.pojo.Customar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class CustomarDatabase {

    String dbpassword = "apcl123456";
    Connection cone;

    public String customarInsert(int phoneNumber, int rechargeAmount, String name, String email, String dob, String address, String occupation, int altNumber) {
        String isInsert = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("insert into customar(phoneNumber, rechargeAmount, name, email, dob, address,"
                    + " occupation, altNumber) values(" + phoneNumber + "," + rechargeAmount + ",'" + name + "','" + email + "','" + dob + "','" + address + "','" + occupation + "'," + altNumber + ");");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                isInsert = " Information Has Been RECORDED";
            } else {
                isInsert = "Information Not RECORDED";
            }

        } catch (ClassNotFoundException | SQLException ex) {
            isInsert += ex;
        }
        return isInsert;
    }

    public boolean customarRecharge(int cphoneNumber, int crechargeAmount) {
        boolean Recharge = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("update customar set rechargeAmount=(rechargeAmount+" + crechargeAmount + ") where phoneNumber=" + cphoneNumber + "; ");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                Recharge = true;
            } else {
                Recharge = false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Recharge = false;
        }
        return Recharge;
    }

    public boolean CusRecharge(int cphoneNumber, int crechargeAmount, int aphoneNumber) {
        boolean isInsert = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("insert into crechargetable(date,cphoneNumber, crechargeAmount, aphoneNumber) values(CURDATE()," + cphoneNumber + "," + crechargeAmount + "," + aphoneNumber + ");");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                isInsert = true;
            } else {
                isInsert = false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            isInsert = false;
        }
        return isInsert;
    }

    public List<cRechargeGetSet> retriveRecharge(int aphoneNumber) {

        List<cRechargeGetSet> resList = new ArrayList<cRechargeGetSet>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("select * from crechargetable where aphoneNumber=" + aphoneNumber);
            ResultSet rse = stmnt.executeQuery();
            while (rse.next()) {
                cRechargeGetSet rlist = new cRechargeGetSet();
                rlist.setId(rse.getInt("id"));
                rlist.setDate(rse.getDate("date"));
                rlist.setCphoneNumber(rse.getInt("cphoneNumber"));
                rlist.setCrechargeAmount(rse.getInt("crechargeAmount"));
                rlist.setAphoneNumber(rse.getInt("aphoneNumber"));
                resList.add(rlist);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return resList;
    }

//            main mathod to test
    public static void main(String a[]) {
        CustomarDatabase cdb = new CustomarDatabase();

        List<cRechargeGetSet> data = cdb.retriveRecharge(1966120702);

        System.out.println(data);
    }

//         FOR SESTFULL SERVICE
    public boolean customarInsert2(Customar cus) {
        boolean isInsert = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("insert into customar(phoneNumber, rechargeAmount, name, email, dob, address,"
                    + " occupation, altNumber) values(" + cus.getPhoneNumber() + "," + cus.getRechargeAmount() + ",'" + cus.getName() + "','" + cus.getEmail() + "','" + cus.getDob() + "','" + cus.getAddress() + "','" + cus.getOccupation() + "'," + cus.getAltNumber() + ");");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                isInsert = true;
            } else {
                isInsert = false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            isInsert = false;
        }
        return isInsert;
    }

    public boolean customarUpdate(Customar cus) {
        boolean Recharge = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("update customar set rechargeAmount=" + cus.getRechargeAmount() + ", name='" + cus.getName() + "',email='" + cus.getEmail() + "',dob='" + cus.getDob() + "',address='" + cus.getAddress() + "',occupation='" + cus.getOccupation() + "',altNumber='" + cus.getAltNumber() + "'  where phoneNumber=" + cus.getPhoneNumber() + "; ");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                Recharge = true;
            } else {
                Recharge = false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Recharge = false;
        }
        return Recharge;
    }

    public List<Customar> customarRetrive() {

        List<Customar> resList = new ArrayList<Customar>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("select * from customar");
            ResultSet rse = stmnt.executeQuery();
            while (rse.next()) {
                Customar rlist = new Customar();
                rlist.setPhoneNumber(rse.getInt("phoneNumber"));
                rlist.setRechargeAmount(rse.getInt("rechargeAmount"));
                rlist.setName(rse.getString("name"));
                rlist.setEmail(rse.getString("email"));
                rlist.setDob(rse.getString("dob"));
                rlist.setAddress(rse.getString("address"));
                rlist.setOccupation(rse.getString("occupation"));
                rlist.setAltNumber(rse.getInt("altNumber"));
                resList.add(rlist);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return resList;
    }

    public Customar customarRetrive2(int phonenum) {

        Customar resList = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("select * from customar where phoneNumber=" + phonenum);
            ResultSet rse = stmnt.executeQuery();
            while (rse.next()) {
                Customar rlist = new Customar();
                rlist.setPhoneNumber(rse.getInt("phoneNumber"));
                rlist.setRechargeAmount(rse.getInt("rechargeAmount"));
                rlist.setName(rse.getString("name"));
                rlist.setEmail(rse.getString("email"));
                rlist.setDob(rse.getString("dob"));
                rlist.setAddress(rse.getString("address"));
                rlist.setOccupation(rse.getString("occupation"));
                rlist.setAltNumber(rse.getInt("altNumber"));
                resList = rlist;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return resList;
    }

    public boolean customarDelete(Customar cus) {
        boolean Recharge = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/telecomdb", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("delete from customar  where phoneNumber=" + cus.getPhoneNumber() + "; ");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                Recharge = true;
            } else {
                Recharge = false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Recharge = false;
        }
        return Recharge;
    }
//      FOR SESTFULL SERVICE

// 
    public boolean insertIdName(String a, String b) {
        boolean isInsert = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("insert into idname( name, password) values('" + a + "','" + b + "');");
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                isInsert = true;
            } else {
                isInsert = false;
            }

        } catch (ClassNotFoundException | SQLException ex) {

        }
        return isInsert;
    }

    public List<Getter> retriveAllData() {

        List<Getter> resList = new ArrayList<Getter>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("select * from idname;");
            ResultSet rse = stmnt.executeQuery();
            while (rse.next()) {
                Getter rlist = new Getter();
                rlist.setId(rse.getInt("id"));
                rlist.setName(rse.getString("name"));
                rlist.setPassword(rse.getString("password"));
                resList.add(rlist);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resList;
    }

    public List<Object> rsOne(int id) {

        List<Object> resList = new ArrayList<Object>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("select * from gparesult where id=" + id);
            ResultSet rse = stmnt.executeQuery();
            while (rse.next()) {
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
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resList;
    }

    public boolean delete(int id) {
        boolean isInsert = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradingsystem", "root", dbpassword);
            PreparedStatement stmnt = cone.prepareStatement("delete from gparesult where id=" + id);
            int updat = stmnt.executeUpdate();
            if (updat > 0) {
                isInsert = true;
            } else {
                isInsert = false;
            }

        } catch (ClassNotFoundException | SQLException ex) {

        }
        return isInsert;
    }
}
