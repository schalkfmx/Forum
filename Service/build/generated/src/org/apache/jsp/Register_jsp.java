package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <form action=\"RegisterServlet\" method=\"post\">\n");
      out.write("                <label ID=\"heading\">Register</label>\n");
      out.write("                <p align = \"center\"> ");
 if(session.getAttribute("registerStatus") != null){out.println(session.getAttribute("registerStatus"));} 
      out.write(" </p>\n");
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
      out.write("                        <input type=\"radio\" id=\"gender\" name=\"gender\" value=\"male\">\n");
      out.write("                        <label for=\"Male\" class=\"genderLabel\">Male</label>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"genderLi\">\n");
      out.write("                        <input type=\"radio\" id=\"gender\" name=\"gender\" value=\"female\">\n");
      out.write("                        <label for=\"Female\" class=\"genderLabel\">Female</label>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <input id=\"registerBut\" type=\"submit\" value=\"Register\">\n");
      out.write("                <input id=\"loginBut\" type=\"submit\" value=\"Login\" formaction=\"Login.jsp\">\n");
      out.write("            </form>\n");
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
