/*
 Name:           UpdateInfoServlet
 Description     This servlet contains all the processing when a user Update his profile information.
 Author:         Schalk Mouton
 Date:           26 July 2018
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "UpdateInfoServlet", urlPatterns = {"/UpdateInfoServlet"})
public class UpdateInfoServlet extends HttpServlet {

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
            boolean updateSuccessful = updateInfo(uName, pWord, email, securityA, gender);
            if (updateSuccessful == true) {
                updateSession(session, uName);
                session.setAttribute("updateStatus", "Updated Successfully!");
                response.sendRedirect("/Service/Profile.jsp");
            } else {
                session.setAttribute("updateStatus", "Error, check details and try again!");
                response.sendRedirect("/Service/Profile.jsp");
            }
        }
    }

    private static boolean updateInfo(java.lang.String uName, java.lang.String pWord, java.lang.String email, java.lang.String securityA, java.lang.String gender) {
        server.Server_Service service = new server.Server_Service();
        server.Server port = service.getServerPort();
        return port.updateInfo(uName, pWord, email, securityA, gender);
    }
    
    public void updateSession(HttpSession session, String uName){
        server.Server_Service service = new server.Server_Service();
        server.Server port = service.getServerPort();
        ArrayList info = (ArrayList) port.retrieveInfo(uName);

        session.setAttribute("uName", uName);
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
