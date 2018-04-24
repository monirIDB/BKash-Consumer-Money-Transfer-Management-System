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
public class CusrechargrSublet extends HttpServlet {

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
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CusrechargrSublet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CusrechargrSublet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");

            int cphoneNumber = Integer.parseInt(request.getParameter("cphoneNumber"));
            int crechargeAmount = Integer.parseInt(request.getParameter("crechargeAmount"));
            int aphoneNumber = Integer.parseInt(request.getParameter("aphoneNumber"));
            
            int agentAmount;
            int netbalance;

            String cusRechargeMassage = "";

            AgentDatabase adb = new AgentDatabase();
            CustomarDatabase cdb = new CustomarDatabase();

            agentAmount = adb.getagentAmount(aphoneNumber);
            netbalance=agentAmount-crechargeAmount;

            if (agentAmount >= crechargeAmount) {
                boolean isrechar = cdb.customarRecharge(cphoneNumber, crechargeAmount);
                if (isrechar) {
                    boolean amountUpdate = adb.agentAmountUpdate(aphoneNumber, crechargeAmount);
                    boolean insertCusRecharge = cdb.CusRecharge(cphoneNumber, crechargeAmount,aphoneNumber);
                    if(amountUpdate && insertCusRecharge){
                         cusRechargeMassage = " RECHARGE SUCCESS  <br> TO =0"+cphoneNumber+ ", <br> "
                          + "Amount="+crechargeAmount+"  <br>    + FROM =0"+aphoneNumber+" <br> YOUR NEET BALANCE="+netbalance;
                    }
                } else {
                    cusRechargeMassage = " CUSTOMAR NUMBER NOT MATCH";
                }
            } else {
                cusRechargeMassage = " YOU HAVE NOT ANOUGH BALENCE TO RECHARGE";
            }

            request.setAttribute("cusRechargeMassage", cusRechargeMassage);

            RequestDispatcher dispatch = request.getRequestDispatcher("CustomarReg.jsp");
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
