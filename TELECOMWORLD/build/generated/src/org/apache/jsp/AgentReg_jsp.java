package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgentReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!--        carasol resorces-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"recorces/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"recorces/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"recorces/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"resources/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--        angular resorces-->\n");
      out.write("        <script src=\"resources/angular.min.js\"></script>\n");
      out.write("        <script src=\"resources/angular-animate.js\"></script>\n");
      out.write("        <script src=\"resources/angular.js\"></script> \n");
      out.write("        <script src=\"resources/angular-route.js\"></script>\n");
      out.write("        <!--              parsonal stylesheet-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"recorces/css/style.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body{background:url(img/backgroung.png)repeat}\n");
      out.write("            input{width: 500px}\n");
      out.write("            input.ng-invalid {background-color:pink;}\n");
      out.write("            input.ng-valid { background-color:lightgreen;}\n");
      out.write("            form.ng-invalid {background-color:pink;}\n");
      out.write("            form .ng-valid { background-color: lightgreen; }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("             \n");
      out.write("            var myapp = angular.module(\"exampleApp\", []);\n");
      out.write("                    myapp.controller(\"defaultCtrl\", function ($scope) {\n");
      out.write("                        $scope.addUser = function (userDetails) {\n");
      out.write("                            $scope.message = userDetails.name + \" (\" + userDetails.email + \") (\" + userDetails.agreed + \")\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        $scope.message = \"Ready\";\n");
      out.write("                    });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        <div class=\"menu_area fix\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"img/logo.PNG\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main_menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.html\" style=\"background:#C52D2F\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">SIM Packages</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">SIM Packages </a></li>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">SIM Packages</a></li>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">SIM Packages</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\">MB Package</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">MB Package</a></li>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">MB Package</a></li>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">MB Package</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"AgentReg.jsp\">Offers</a> \n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">Offers</a></li>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">Offers</a></li>\n");
      out.write("                                <li><a href=\"AgentReg.jsp\">Offers</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"LogInPage.jsp\">Log Out</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"LogInPage.jsp\">Log Out</a></li>\n");
      out.write("                                <li><a href=\"LogInPage.jsp\">Log Out</a></li>\n");
      out.write("                                <li><a href=\"LogInPage.jsp\">Log Out</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"RestfullCustom.jsp\">Restfull Service</a></li>\n");
      out.write("                        <li><a href=\"CustomarReg.jsp\">Customer Reg</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div  style=\" margin: 0px auto;   width:1217px;\">\n");
      out.write("             <div ng-hide=\"myCheck3\" style=\"height:40px; margin: 0px auto;   width:1217px; background-color: #985f0d\">\n");
      out.write("                <div  style=\"height:40px;  margin-left:100px; float:left;background-color: #1ab188\">\n");
      out.write("                    <h3>RETAILER REGISTRATION FORM</h3></div>\n");
      out.write("                <div  style=\"height:40px;  margin-left:350px; float:left; background-color: #1ab188\">\n");
      out.write("                    <h3>RETAILER RECHARGE</h3></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div ng-app=\"exampleApp\" id=\"todoPanel\" class=\"panel\" ng-controller=\"defaultCtrl\">\n");
      out.write("                \n");
      out.write("                    <form name=\"myForm\" style=\"width: 800px; float: left; overflow: hidden;\" method=\"post\" action=\"AgentRegSublet\" novalidate>\n");
      out.write("                        <div class=\"well\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>RETAILER Phone Number: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cusInsertMassage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                <input name=\"phoneNumber\" type=\"number\" ng-model=\"newUser.phoneNumber\" placeholder=\"01900000000\"  ng-pattern=\"/^[0-9]{11}$/\" class=\"form-control\"  Required>\n");
      out.write("                                <span ng-show=\"myForm.phoneNumber.$invalid && myForm.phoneNumber.$dirty\">Number must be  11 character</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Recharge Amount:</label>\n");
      out.write("                                <input name=\"rechargeAmount\" type=\"number\" ng-model=\"newUser.rechargeAmount\" placeholder=\"00\"  ng-pattern=\"/^[0-9]+$/\" class=\"form-control\" Required >\n");
      out.write("                                <span ng-show=\"myForm.rechargeAmount.$invalid && myForm.rechargeAmount.$dirty\">Must be Number</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>RETAILER Full Name:</label>\n");
      out.write("                                <input name=\"name\" type=\"text\" ng-model=\"newUser.name\" placeholder=\"your name\"  ng-pattern=\"/^[A-Za-z -_]{3,25}$/\" class=\"form-control\" Required >\n");
      out.write("                                <span ng-show=\"myForm.name.$invalid && myForm.name.$dirty\">Name must be 3-25 character</span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Email:</label>\n");
      out.write("                                <input name=\"email\" type=\"text\" ng-model=\"newUser.email\" placeholder=\"marocky@gmail.com\"  ng-pattern=\"/^[A-Za-z]+[A-Za-z0-9_]+@[A-Za-z]{2,8}.[A-Za-z]{2,8}[A-Za-z0-9.]*$/\" class=\"form-control\" Required>\n");
      out.write("                                <span ng-show=\"myForm.email.$invalid && myForm.email.$dirty\">Email must be  valid Form</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Date Of Birth:</label>\n");
      out.write("                                <input name=\"dob\" type=\"text\" ng-model=\"newUser.dob\" placeholder=\"01-12-2016\" ng-pattern=\"/^[0-9]{2}-[0-9]{2}-[0-9]{4}$/\" class=\"form-control\" Required>\n");
      out.write("                                <span ng-show=\"myForm.dob.$invalid && myForm.dob.$dirty\">Date Of Birth must be Like 01-12-2016</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Permanent Address:</label>\n");
      out.write("                                <input name=\"address\" type=\"text\" ng-model=\"newUser.address\" placeholder=\"Your permanent address\" ng-pattern=\"/^[A-Za-z0-9_-/|\\.:, #]{3,120}$/\" class=\"form-control\" Required>\n");
      out.write("                                <span ng-show=\"myForm.address.$invalid && myForm.address.$dirty\">Permanent Address Required</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>LICENSE Number</label>\n");
      out.write("                                <input name=\"license\" type=\"text\" ng-model=\"newUser.license\" placeholder=\"Occupation\" ng-pattern=\"/^[A-Za-z0-9 -_:,;']{3,25}$/\" class=\"form-control\" Required>\n");
      out.write("                                <span ng-show=\"myForm.license.$invalid && myForm.license.$dirty\">Occupation  Required</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Another Contract Number:</label>\n");
      out.write("                                <input name=\"altNumber\" type=\"number\" ng-model=\"newUser.altNumber\" placeholder=\"01900000000\"  ng-pattern=\"/^[0-9]{11}$/\" class=\"form-control\" Required >\n");
      out.write("                                <span ng-show=\"myForm.altNumber.$invalid && myForm.altNumber.$dirty\">Number must be  11 character</span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input name=\"agreed\" type=\"checkbox\" ng-model=\"newUser.agreed\" required>\n");
      out.write("                                    I agree with this condition\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"reset\" class=\"btn btn-primary\">\n");
      out.write("                                CLEAR\n");
      out.write("                            </button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary \"  ng-disabled=\"myForm.$invalid\">\n");
      out.write("                                SUBMIT\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        Form Validation ? ==<b>{{myForm.$valid}}</b>\n");
      out.write("                        <span ng-show=\"myForm.$invalid\">Your Form is Invalid You Cannot Submit Now</span>\n");
      out.write("                        <span ng-show=\"myForm.$valid\">Your Form is Valid You Can Submit Now</span>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                     <form name=\"myForm2\"  style=\"width: 360px; float: left; overflow: hidden;\" method=\"post\" action=\"RetailerRechargrSublet\" novalidate>\n");
      out.write("                        <div class=\"well\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>RETAILER Phone Number:</label>\n");
      out.write("                                <input name=\"aphoneNumber\" type=\"number\" ng-model=\"newUser.aphoneNumber\" placeholder=\"01900000000\"  ng-pattern=\"/^[0-9]{11}$/\" class=\"form-control\"  Required>\n");
      out.write("                                <span ng-show=\"myForm.aphoneNumber.$invalid && myForm.aphoneNumber.$dirty\">Number must be  11 character</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Recharge Amount:</label>\n");
      out.write("                                <input name=\"arechargeAmount\" type=\"number\" ng-model=\"newUser.arechargeAmount\" placeholder=\"00\"  ng-pattern=\"/^[1-9]+[0-9]+$/\" class=\"form-control\" Required >\n");
      out.write("                                <span ng-show=\"myForm.arechargeAmount.$invalid && myForm.arechargeAmount.$dirty\">Must be Number</span>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label>\n");
      out.write("                                    <input name=\"IsAgreed\" type=\"checkbox\" ng-model=\"newUser.IsAgreed\" required>\n");
      out.write("                                    ALL INFORMATION IS CORRECT ?\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"reset\" class=\"btn btn-primary\">\n");
      out.write("                                CLEAR\n");
      out.write("                            </button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary \"  ng-disabled=\"myForm2.$invalid\">\n");
      out.write("                                SUBMIT\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        Form Validation ? ==<b>{{myForm2.$valid}}</b>\n");
      out.write("                        \n");
      out.write("                        <div> RECHARGE MASSAGE= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.agentRechargeMassage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
