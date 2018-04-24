/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.AgentDatabase;
import com.model.CustomarDatabase;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class AgentRegSublet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AgentRegSublet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AgentRegSublet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");


              int phoneNumber=Integer.parseInt(request.getParameter("phoneNumber"));
              int rechargeAmount=Integer.parseInt(request.getParameter("rechargeAmount"));
              String name=request.getParameter("name");
              String email=request.getParameter("email");
              String dob=request.getParameter("dob");
              String address=request.getParameter("address");
              String license=request.getParameter("license");
              int altNumber=Integer.parseInt(request.getParameter("altNumber"));
              
             String cusInsertMassage;
             
             AgentDatabase cusdb=new AgentDatabase();
             cusInsertMassage=cusdb.agentInsert(phoneNumber, rechargeAmount, name, email, dob, address, license, altNumber);

             request.setAttribute("cusInsertMassage", cusInsertMassage);
            
            
            RequestDispatcher dispatch = request.getRequestDispatcher("AgentReg.jsp");
            dispatch.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
