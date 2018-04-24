package com.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.pojo.Customar;
import com.service.CustomarService;

@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomarResource {

    CustomarService custservice = new CustomarService();
    
     @GET
    public List<Customar> customarAllInformation() {
        List<Customar> information = custservice.retriveCustomarInfo();
        return information;
    }
    
    @GET
    @Path("/{phoneId}")
    public Customar customarAllInformation(@PathParam("phoneId") int phone) {
        Customar information = custservice.retriveCustomarInfo2(phone);
        return information;
    }
    
      @POST
    public void customarInsertInformation(Customar allinfo) {
        boolean information = custservice.insertCustomarInfo(allinfo);
       
    }
    
    @PUT
    @Path("/{phoneId}")
    public void customarUpdateInformation(@PathParam("phoneId") int phoneId ,Customar allinfo) {
        allinfo.setPhoneNumber(phoneId);
        boolean information = custservice.updateCustomarInfo(allinfo);
       
    }
    

    
    @DELETE
    @Path("/{phoneId}")
    public void customarDeleteInformation(@PathParam("phoneId") int phoneID) {
        Customar cust = new Customar();
        cust.setPhoneNumber(phoneID);
        custservice.deleteCustomarInfo(cust);
    }

    public static void main(String[] args) {
        CustomarService c = new CustomarService();
        Customar cust = new Customar();
        cust.setPhoneNumber(1928003853);
        c.deleteCustomarInfo(cust);
    }
    
}
