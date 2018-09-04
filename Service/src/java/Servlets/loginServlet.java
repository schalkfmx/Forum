/*
 Name:           loginServlet
 Description     This servlet contains all the processing when te login form is submitted.
 Author:         Schalk Mouton
 Date:           26 July 2018
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(true);
            String uName = request.getParameter("uName");
            String pWord = request.getParameter("pWord");
            boolean valid = checkDetails(uName, pWord);
            if (valid == true) {
                session.setAttribute("valid", "true");
                response.sendRedirect("/Service/Topics.jsp");
                session.setAttribute("uName", uName);
                loadDetails(session);
            } else {
                session.setAttribute("valid", "false");
                response.sendRedirect("/Service/Login.jsp");
            }
        }
    }

    private static Boolean checkDetails(java.lang.String uName, java.lang.String pWord) {
        server.Server_Service service = new server.Server_Service();
        server.Server port = service.getServerPort();
        return port.checkDetails(uName, pWord);
    }

    public void loadDetails(HttpSession session) {
        String uName = (String) session.getAttribute("uName");

        server.Server_Service service = new server.Server_Service();
        server.Server port = service.getServerPort();
        ArrayList info = (ArrayList) port.retrieveInfo(uName);

        session.setAttribute("pWord", info.get(1));
        session.setAttribute("email", info.get(2));
        session.setAttribute("sAnswer", info.get(3));
        session.setAttribute("gender", info.get(4));
        
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

}
