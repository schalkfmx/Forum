/*
 Name:           RegisterServlet
 Description     This servlet contains all the processing when a user register.
 Author:         Schalk Mouton
 Date:           26 July 2018
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(true);
            String uName = request.getParameter("uName");
            String pWord = request.getParameter("pWord");
            String email = request.getParameter("email");
            String securityA = request.getParameter("sAnswer");
            String gender = request.getParameter("gender");
            boolean registerSuccessful = register(uName, pWord, email, securityA, gender);
            if (registerSuccessful == true) {
                session.setAttribute("registerStatus", "Registered Successfully!");
                response.sendRedirect("/Service/Register.jsp");
            } else {
                session.setAttribute("registerStatus", "Error, check details and try again!");
                response.sendRedirect("/Service/Register.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private static boolean register(java.lang.String uName, java.lang.String pWord, java.lang.String email, java.lang.String securityA, java.lang.String gender) {
        server.Server_Service service = new server.Server_Service();
        server.Server port = service.getServerPort();
        return port.register(uName, pWord, email, securityA, gender);
    }

}
