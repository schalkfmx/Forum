/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2018-06-27 22:26:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Register</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(Resources/Background.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat scroll;\n");
      out.write("            }\n");
      out.write("            #registerBox{\n");
      out.write("                position: fixed;\n");
      out.write("                top: 10%;\n");
      out.write("                left: 38%;\n");
      out.write("                width: 20%;\n");
      out.write("                height: auto; \n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                padding: 2%;\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                position: relative;\n");
      out.write("                left: 5%;\n");
      out.write("                height: auto;\n");
      out.write("                display: block;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            #heading{\n");
      out.write("                font-size: 200%;\n");
      out.write("                height: 60px;\n");
      out.write("                font-family: Forte;\n");
      out.write("            }\n");
      out.write("            input {\n");
      out.write("                position: relative;\n");
      out.write("                width: 90%;\n");
      out.write("                padding: 3%;\n");
      out.write("                margin: 5%;\n");
      out.write("                display: block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            #genderUl {\n");
      out.write("                list-style: none;\n");
      out.write("                margin: 3%;\n");
      out.write("                margin-bottom: 10%;\n");
      out.write("                padding: 1%;\n");
      out.write("            }\n");
      out.write("            #genderLi {\n");
      out.write("                display: inline-block;\n");
      out.write("                position: relative;\n");
      out.write("                float: left;\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("            .genderLabel {\n");
      out.write("                display: inline;\n");
      out.write("                position: relative;\n");
      out.write("                margin-left: 20%;\n");
      out.write("            }\n");
      out.write("            input[type=radio] {\n");
      out.write("                position: absolute;\n");
      out.write("                float: left;\n");
      out.write("                height: 110%;\n");
      out.write("                width: 15%;\n");
      out.write("                background-color: #eee;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                margin-top: -1%;\n");
      out.write("            }\n");
      out.write("            #registerBut {\n");
      out.write("                width: 40%;\n");
      out.write("                height: auto;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                border: none;\n");
      out.write("                display: inline;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            #loginBut {\n");
      out.write("                width: 40%;\n");
      out.write("                background-color: #f44242;\n");
      out.write("                margin: 3%;\n");
      out.write("                border: none;\n");
      out.write("                display: inline;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"registerBox\">\n");
      out.write("            <form action=\"Register\" method=\"post\">\n");
      out.write("                <label ID=\"heading\">Register</label>\n");
      out.write("                <label for=\"uName\">Username:</label>\n");
      out.write("                <input type=\"text\" id=\"uName\" name=\"uName\" placeholder=\"Enter a username\">\n");
      out.write("                <label for=\"pWord\">Password:</label>\n");
      out.write("                <input type=\"password\" id=\"pWord\" name=\"pWord\" placeholder=\"Enter password\">\n");
      out.write("                <label for=\"email\">Email Address</label>\n");
      out.write("                <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Enter your email\">\n");
      out.write("                <label for=\"sAnswer\">Whats your favourite color?</label>\n");
      out.write("                <input type=\"text\" id=\"sAnswer\" name=\"sAnswer\" placeholder=\"Enter answer here\">\n");
      out.write("                <label for=\"gender\">Gender:</label>\n");
      out.write("                <ul id=\"genderUl\">\n");
      out.write("                    <li id=\"genderLi\">\n");
      out.write("                        <input type=\"radio\" id=\"Male\" name=\"gender\">\n");
      out.write("                        <label for=\"Male\" class=\"genderLabel\">Male</label>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"genderLi\">\n");
      out.write("                        <input type=\"radio\" id=\"Female\" name=\"gender\">\n");
      out.write("                        <label for=\"Female\" class=\"genderLabel\">Female</label>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <input id=\"registerBut\" type=\"submit\" value=\"Register\">\n");
      out.write("                <input id=\"loginBut\" type=\"submit\" value=\"Login\" formaction=\"Login.jsp\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
