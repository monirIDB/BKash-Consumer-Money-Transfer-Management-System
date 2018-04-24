package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RestFullCustom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>  \n");
      out.write("        <link rel=\"stylesheet\" href=\"recorces/css/bootstrap.min.css\" />\n");
      out.write("        <script src=\"resources/angular.js\"></script>\n");
      out.write("\n");
      out.write("        <title>AngularJS $http Restfull Example</title>  \n");
      out.write("        <script src=\"resources/myangular.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("             body{background:url(img/backgroung.png)repeat}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body ng-app=\"simpleApp\" ng-controller=\"simpleCtrl\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("<!--            <h1>\n");
      out.write("             ROCK HTTP AngularJS Restful Web Services \n");
      out.write("            </h1> -->\n");
      out.write("            <div ng-hide=\"myCheck3\" style=\"height:40px; margin: 0px auto;   width:1150px; background-color: #FC4A4A\">\n");
      out.write("                <div  style=\" margin-left:200px; width: 800px; background: #4cae4c\"> <h1> Rock  HTTP AngularJS Restful Web Services</h1></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div style=\"background-color: #ce8483\" class=\"col-sm-12\"> \n");
      out.write("                    <input type=\"button\" value=\"{{customars.length}}\" class=\"btn btn-success btn-lg\" />\n");
      out.write("                  *------------*-----------*---------*-----------*\n");
      out.write("                   <a href=\"AgentReg.jsp\">Agent Reg</a>----------*------------\n");
      out.write("                    <a href=\"LogInPage.jsp\">Log Out</a>----------*------------\n");
      out.write("                    <a href=\"index.jsp\">HOME</a>----------*------------*-----------*\n");
      out.write("                    \n");
      out.write("                    <form class=\"form-horizontal\" ng-submit=\"submitSimple()\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-4\" >Customer Phone Number</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input class=\"form-control\" ng-model=\"simpleForm.phoneNumber\"  />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-4\" >Customer Recharge Amount</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input class=\"form-control\" ng-model=\"simpleForm.rechargeAmount\"  />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-4\" >Customer Name</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input class=\"form-control\" ng-model=\"simpleForm.name\"  />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-4\" >Customer Email</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input class=\"form-control\" ng-model=\"simpleForm.email\"  />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-4\" >Date Of Birth</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input class=\"form-control\" ng-model=\"simpleForm.dob\"  />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-4\" >Customer Address</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input class=\"form-control\" ng-model=\"simpleForm.address\"  />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-4\" >Customer Occupation</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input class=\"form-control\" ng-model=\"simpleForm.occupation\"  />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-4\" >Alternative Phone Number</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input class=\"form-control\" ng-model=\"simpleForm.altNumber\"  />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-success btn-lg\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                <div style=\"background-color: #eed3d7\" class=\"col-sm-12\">\n");
      out.write("                    <div ng-hide=\"myCheck3\" style=\"height:20px; margin:0px auto    width:1150px; background-color: #C52D2F\"></div>\n");
      out.write("                    <table border=\"1\" class=\"table\">\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <th>Phone Number</th>\n");
      out.write("                            <th>Amount</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Date Of Birth</th>\n");
      out.write("                            <th>Address</th>\n");
      out.write("                            <th>Occupation</th>\n");
      out.write("                            <th>Alt Number</th>\n");
      out.write("                            <th>ACTION</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr ng-repeat=\"customar in customars\">\n");
      out.write("                            <td> {{ customar.phoneNumber}}</td>\n");
      out.write("                            <td> {{ customar.rechargeAmount}}</td>\n");
      out.write("                            <td >{{ customar.name}}</td>\n");
      out.write("                            <td> {{ customar.email}}</td>\n");
      out.write("                            <td> {{ customar.dob}}</td>\n");
      out.write("                            <td >{{ customar.address}}</td> \n");
      out.write("                            <td> {{ customar.occupation}}</td>\n");
      out.write("                            <td >{{ customar.altNumber}}</td>\n");
      out.write("\n");
      out.write("                            <td><a ng-click=\"editSimple(customar)\" class=\"blue-button\">Update</a> | <a ng-click=\"deleteSimple(customar)\" class=\"red-button\">Delete</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
