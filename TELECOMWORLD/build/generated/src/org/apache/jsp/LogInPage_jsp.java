package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogInPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("\n");
      out.write("            var myapp = angular.module(\"exampleApp\", []);\n");
      out.write("            myapp.controller(\"defaultCtrl\", function ($scope) {\n");
      out.write("                $scope.addUser = function (userDetails) {\n");
      out.write("                    $scope.message = userDetails.name + \" (\" + userDetails.email + \") (\" + userDetails.agreed + \")\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                $scope.message = \"Ready\";\n");
      out.write("            });\n");
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
      out.write("                        <li><a href=\"CustomarReg.jsp\" style=\"background:#C52D2F\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">SIM Packages</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">SIM Packages </a></li>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">SIM Packages</a></li>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">SIM Packages</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\">MB Package</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">MB Package</a></li>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">MB Package</a></li>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">MB Package</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"CustomarReg.jsp\">Offers</a> \n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">Offers</a></li>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">Offers</a></li>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">Offers</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"CustomarReg.jsp\">Log In</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">Log In</a></li>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">Log In</a></li>\n");
      out.write("                                <li><a href=\"CustomarReg.jsp\">Log In</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"CustomarReg.jsp\">Sign Up</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div  style=\" margin: 0px auto;   width:1217px;\">\n");
      out.write("            <div ng-hide=\"myCheck3\" style=\"height:40px; margin: 0px auto;   width:1217px; background-color: #985f0d\">\n");
      out.write("                <div  style=\" margin-left:400px;\"> <h3>PLEASE LOG IN FOR SERVICE</h3></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div ng-app=\"exampleApp\" id=\"todoPanel\" class=\"panel\" ng-controller=\"defaultCtrl\">\n");
      out.write("\n");
      out.write("                <form name=\"myForm\" style=\"width: 500px; margin: 0px auto\" method=\"post\" action=\"LoginTest.jsp\" novalidate>\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Phone Number:</label>\n");
      out.write("                            <input name=\"phoneNumber\" type=\"number\" ng-model=\"newUser.phoneNumber\" placeholder=\"01900000000\"  ng-pattern=\"/^[0-9]{11}$/\" class=\"form-control\"  Required>\n");
      out.write("                            <span ng-show=\"myForm.phoneNumber.$invalid && myForm.phoneNumber.$dirty\">Number must be  11 character</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                                <label>Email:</label>\n");
      out.write("                                <input name=\"email\" type=\"text\" ng-model=\"newUser.email\" placeholder=\"marocky@gmail.com\"  ng-pattern=\"/^[A-Za-z]+[A-Za-z0-9_]+@[A-Za-z]{2,8}.[A-Za-z]{2,8}[A-Za-z0-9.]*$/\" class=\"form-control\" Required>\n");
      out.write("                                <span ng-show=\"myForm.email.$invalid && myForm.email.$dirty\">Email must be  valid Form</span>\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label>\n");
      out.write("                                <input name=\"agreed\" type=\"checkbox\" ng-model=\"newUser.agreed\" required>\n");
      out.write("                                <h5>CLICK ME TO LOG IN</h5>\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-primary\"> CLEAR</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary \"  ng-disabled=\"myForm.$invalid\">LOG IN</button>\n");
      out.write("                    </div>\n");
      out.write("                    Number Validation ? ==<b>{{myForm.$valid}}</b>\n");
      out.write("                    <span ng-show=\"myForm.$invalid\">Your Number is Invalid You Cannot Submit Now</span>\n");
      out.write("                    <span ng-show=\"myForm.$valid\">Your Number is Valid You Can Submit Now</span>\n");
      out.write("                </form>\n");
      out.write("                            \n");
      out.write("               \n");
      out.write(" <div ng-hide=\"myCheck3\" style=\"height:20px; margin:0px auto    width:1150px; background-color: #C52D2F\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div ng-hide=\"myCheck3\" style=\"height:40px;    width:1217px; background-color: #222\">\n");
      out.write("                <div  style=\"height:40px; margin-left:500px; margin-top: 5px;   width:717px; background-color: #222\">\n");
      out.write("                    <p style=\"color: #ffffff; font-size: large\">&copy; All Right Reserved Online Telecom Distribution System </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
