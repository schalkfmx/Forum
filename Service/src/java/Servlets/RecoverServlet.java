/*
 Name:           RecoverServlet
 Description     This servlet contains all the processing when the user retrieves his/her password.
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

@WebServlet(name = "RecoverServlet", urlPatterns = {"/RecoverServlet"})
public class RecoverServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(true);
            String email = request.getParameter("email");
            String securityA = request.getParameter("sAnswer");
            String password = getPWord(email, securityA);
            session.setAttribute("recoveredPWord", password);
            response.sendRedirect("/Service/PasswordRecovery.jsp");
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

    private static String getPWord(java.lang.String email, java.lang.String securityA) {
        server.Server_Service service = new server.Server_Service();
        server.Server port = service.getServerPort();
        return port.getPWord(email, securityA);
    }

}
