/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.CustomarDatabase;
import com.pojo.Customar;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class CustomarService {

    CustomarDatabase cusData = new CustomarDatabase();

     public boolean insertCustomarInfo(Customar allinfo) {
        boolean insertCustomar = cusData.customarInsert2(allinfo);
        return insertCustomar;
    }
     
      public boolean updateCustomarInfo(Customar allinfo) {
        boolean updateCustomar = cusData.customarUpdate(allinfo);
        return updateCustomar;
    }
    
    
    public List<Customar> retriveCustomarInfo() {
        List<Customar> comeAllCustomar = cusData.customarRetrive();
        return comeAllCustomar;
    }
    
    public Customar retriveCustomarInfo2(int phonenum) {
        Customar comeAllCustomar = cusData.customarRetrive2(phonenum);
        return comeAllCustomar;
    }

    public void deleteCustomarInfo(Customar custPhone) {
      cusData.customarDelete(custPhone);
    }

    //      main mathod to test
    public static void main(String a[]) {
        CustomarService cdb = new CustomarService();
           Customar customar=new Customar();
          customar.setPhoneNumber(1928003854);
//           customar.setRechargeAmount(50);
//           customar.setName("Soriour");
//           customar.setEmail("sorior@gmail.com");
//           customar.setDob("15-05-2000");
//           customar.setAddress("Dhaka");
//           customar.setOccupation("Student");
//           customar.setAltNumber(1954854624);
          // boolean data=cdb.deleteCustomarInfo(customar);
           
           
         //  System.out.println(data);
    }

}
