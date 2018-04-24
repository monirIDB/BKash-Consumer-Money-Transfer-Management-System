package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowAlCustlRecharge_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("                        <li><a href=\"index.jsp\" style=\"background:#C52D2F\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">SIM Packages</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">SIM Packages </a></li>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">SIM Packages</a></li>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">SIM Packages</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\">MB Package</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">MB Package</a></li>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">MB Package</a></li>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">MB Package</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"ShowAlCustlrecharge.jsp\">Offers</a> \n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">Offers</a></li>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">Offers</a></li>\n");
      out.write("                                <li><a href=\"ShowAlCustlrecharge.jsp\">Offers</a></li>\n");
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
      out.write("                         <li><a href=\"CustomarReg.jsp\">Customer Reg</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div  style=\" margin: 0px auto;   width:1217px;\">\n");
      out.write("            <div ng-hide=\"myCheck3\" style=\"height:40px; margin: 0px auto;   width:1217px; background-color: #985f0d\">\n");
      out.write("                <div  style=\" margin-left:400px;\"> <h3>SHOW ALL YOUR RECHARGE</h3></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div ng-app=\"exampleApp\" id=\"todoPanel\" class=\"panel\" ng-controller=\"defaultCtrl\">\n");
      out.write("\n");
      out.write("                <form name=\"myForm\" style=\"width: 500px; margin: 0px auto\" method=\"post\" action=\"ShowCustRcchargeSublet\" novalidate>\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>RETAILER Phone Number:</label>\n");
      out.write("                            <input name=\"aphoneNumber\" type=\"number\" ng-model=\"newUser.aphoneNumber\" placeholder=\"01900000000\"  ng-pattern=\"/^[0-9]{11}$/\" class=\"form-control\"  Required>\n");
      out.write("                            <span ng-show=\"myForm.aphoneNumber.$invalid && myForm.aphoneNumber.$dirty\">Number must be  11 character</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"checkbox\">\n");
      out.write("                            <label>\n");
      out.write("                                <input name=\"agreed\" type=\"checkbox\" ng-model=\"newUser.agreed\" required>\n");
      out.write("                                <h3>CLICK ME TO SHOW</h3>\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-primary\"> CLEAR</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary \"  ng-disabled=\"myForm.$invalid\">SUBMIT</button>\n");
      out.write("                    </div>\n");
      out.write("                    Number Validation ? ==<b>{{myForm.$valid}}</b>\n");
      out.write("                    <span ng-show=\"myForm.$invalid\">Your Number is Invalid You Cannot Submit Now</span>\n");
      out.write("                    <span ng-show=\"myForm.$valid\">Your Number is Valid You Can Submit Now</span>\n");
      out.write("                </form>\n");
      out.write("                            \n");
      out.write("                <div style=\"height:450px; width:100%; margin:0px auto; background-color:forestgreen ;\">\n");
      out.write("                    <div ng-hide=\"myCheck3\" style=\"height:20px; margin:0px auto    width:1150px; background-color: #C52D2F\"></div>\n");
      out.write("                    <form  style=\"height:300px; width:80%; margin: 0px auto; background-color:aquamarine \">\n");
      out.write("                        <table border=\"2\" style=\"margin: 0px auto\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th><b>Recharge Id</b></th>\n");
      out.write("                                    <th><b>Recharge Date</b></th>\n");
      out.write("                                    <th><b>Customer Phone Number</b></th>\n");
      out.write("                                    <th><b>Recharge amount</b></th>\n");
      out.write("                                    <th><b>Agent Number</b></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write(" <div ng-hide=\"myCheck3\" style=\"height:20px; margin:0px auto    width:1150px; background-color: #C52D2F\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div ng-hide=\"myCheck3\" style=\"height:20px;    width:1217px; background-color: #C52D2F\"></div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.allRecharge}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.cphoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.crechargeAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.aphoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
