/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2017-08-07 09:10:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.String.*;
import unit6.*;
import java.util.LinkedList;
import java.util.Vector;
import client.DatabaseConnectClient;
import java.text.SimpleDateFormat;

public final class chat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

            String name;
            String eMail;
            String comment = "";
            String reply = "";
            String topicName = "";

            //Load topics to page
            public void loadTopics(JspWriter out, DatabaseConnectClient connection) {
                try {
                    //connecting
                    connection.start();
                    connection.reset();
                    //Executing query
                    connection.executeQuery("SELECT users.nameAndSur, topics.topicID, "
                            + "topics.topic, topics.descrip, topics.postDate "
                            + "FROM users JOIN topics ON users.eMail = topics.eMail");
                    //looping through results
                    while (connection.next()) {
                        //Getting information from database
                        String postName = (String) connection.getNext(1);
                        int topicID = (Integer) connection.getNext(2);
                        String topic = (String) connection.getNext(3);
                        String descrip = (String) connection.getNext(4);
                        String date = connection.getNext(5).toString().substring(0, 10);
                        //Printing topics
                        out.println("<div style='width: 80%;margin-left: 10%;'>");
                        out.println("<p class='topic-title'><b>" + topic + 
                                "</b><span style='float:right;'>" + date + "</span></p>");
                        out.println("<p class='topic-descrip'>" + postName + 
                                "<span class='topic-format'>" + descrip + "</span></p>");
                        out.println("</div><br>");
                        out.println("<form action='chat.jsp' method='post'>");
                        out.println("<input type='hidden' name='topic' value='" 
                                + topicID + "'>");
                        out.println("<input type='submit' value='Enter topic' "
                                + "class='btn-enter'>");
                        out.println("</form><br><br>");
                    }
                } catch (Exception e) {
                }
            }

            //Load comments of topic to page
            public void loadComments(JspWriter out, DatabaseConnectClient connection) {
                loadBackButton(out, "chat.jsp", "topics");
                try {
                    //Connecting
                    connection.start();
                    connection.reset();
                    //Executing query
                    connection.executeQuery("SELECT users.nameAndSur, topics.topicID, "
                            + "topics.topic, topics.descrip, topics.postDate "
                            + "FROM users JOIN topics ON users.eMail = topics.eMail "
                            + "WHERE topics.topicID = '" + comment + "'");
                    if (connection.next()) {
                        //Getting information from database
                        String postName = (String) connection.getNext(1);
                        topicName = (String) connection.getNext(3);
                        String descrip = (String) connection.getNext(4);
                        String date = connection.getNext(5).toString().substring(0, 10);
                        //Printing topic
                        out.println("<div style='width: 80%; margin-left: 10%;'>");
                        out.println("<p class='topic-title'><b>" + topicName + 
                                "</b><span style='float:right;'>" + date + "</span></p>");
                        out.println("<p class='topic-descrip'>" + postName + 
                                "<span class='topic-format'>" + descrip + "</span></p>");
                        out.println("</div><br>");
                    }
                    out.println("<div class='chat-logs'>");
                    connection.reset();
                    //Excuting query
                    connection.executeQuery("SELECT comments.commentID, users.nameAndSur, "
                            + "comments.comment, comments.postDate FROM topics "
                            + "JOIN comments ON comments.topicID = topics.topicID "
                            + "JOIN users ON comments.eMail = users.eMail "
                            + "WHERE topics.topicID = '" + comment + "'");
                    LinkedList<Vector> tempList = new LinkedList();
                    //Looping through resalts
                    while (connection.next()) {
                        int commentID = (Integer) connection.getNext(1);
                        String postNameCom = (String) connection.getNext(2);
                        String comment = (String) connection.getNext(3);
                        String comDate = connection.getNext(4).toString().substring(0, 10);
                        Vector contents = new Vector();
                        //Adding information to list
                        contents.add(commentID);
                        contents.add(postNameCom);
                        contents.add(comment);
                        contents.add(comDate);
                        tempList.add(contents);
                    }
                    //Looping through list
                    while (!tempList.isEmpty()) {
                        Vector contents = tempList.getFirst();
                        //Gettinginformation from list
                        int commentID = (Integer) contents.get(0);
                        String postNameCom = contents.get(1).toString();
                        String comment = contents.get(2).toString();
                        String comDate = contents.get(3).toString().substring(0, 10);
                        tempList.removeFirst();
                        //Printing comment
                        if (postNameCom.equals(name)) {
                            out.println("<form action=chat.jsp class='chat-main me-main' "
                                    + "method='post'>");
                            out.println("<div class='message-main'><div style='text-align: left;'><b>"
                                    + postNameCom + "</b><span style='float: right;'>"
                                    + comDate + "</span></div>");
                            out.println("<div style='text-align: center;'>" 
                                    + comment + "</div></div><br>");
                            out.println("<img src='myAvatar.png'/><br>");
                            out.println("<input type=hidden name=comment value='"
                                    + commentID + "'>");
                            out.println("</form>");
                        } else {
                            out.println("<form action=chat.jsp class='chat-main other-main'"
                                    + " method='post'>");
                            out.println("<img src='otherAvatar.png'/>");
                            out.println("<div class='message-main'><div style='text-align: left;'><b>"
                                    + postNameCom + "</b><span style='float: right;'>"
                                    + comDate + "</span></div>");
                            out.println("<div style='text-align: center;'>"
                                    + comment + "</div></div><br>");
                            out.println("<input type=hidden name=comment value='"
                                    + commentID + "'>");
                            out.println("<input type='submit' value='Reply' "
                                    + "class='btn-reply'>");
                            out.println("</form>");
                        }
                        connection.reset();
                        //Executing query
                        connection.executeQuery("SELECT users.nameAndSur, replys.reply, "
                                + "replys.postDate FROM comments JOIN replys "
                                + "ON comments.commentID = replys.commentID "
                                + "JOIN users ON replys.eMail = users.eMail "
                                + "WHERE comments.commentID = '" + commentID + "'");
                        while (connection.next()) {
                            //Getting information from database
                            String postNameRep = (String) connection.getNext(1);
                            String reply = (String) connection.getNext(2);
                            String repDate = connection.getNext(3).toString().substring(0, 10);
                            //Printing reply
                            if (postNameRep.equals(name)) {
                                out.println("<form class='chat-reply me-reply' "
                                        + "method='post'>");
                                out.println("<img src='myAvatar.png'/><br>");
                                out.println("<div class='message-reply'><div style='text-align: left;'><b>"
                                        + postNameRep + "</b><span style='float: right;'>"
                                        + repDate + "</span></div>");
                                out.println("<div style='text-align: center;'>"
                                        + reply + "</div></div><br>");
                                out.println("</form>");
                            } else {
                                out.println("<form class='chat-reply other-reply'"
                                        + " method='post'>");
                                out.println("<div class='message-reply'>"
                                        + "<div style='text-align: left;'><b>"
                                        + postNameRep + "</b><span style='float: right;'>"
                                        + repDate + "</span></div>");
                                out.println("<div style='text-align: center;'>"
                                        + reply + "</div></div><br>");
                                out.println("<img src='otherAvatar.png'/>");
                                out.println("</form>");
                            }
                        }
                    }
                    out.println("</div>");
                } catch (Exception e) {
                }
            }

            //Load interface to send comment or reply to page
            public void sendInter(JspWriter out, String message) {
                try {
                    //Printing comment box
                    out.println("<form action=chat.jsp class='chat-form' method='post'>");
                    out.println("<textarea name='message' maxlength='100'>"
                            + message + "</textarea>");
                    out.println("<input type='submit' value='Send' name='send' "
                            + "class='btn-send'>");
                    out.println("</form>");
                } catch (Exception e) {
                }
            }

            //Test if given text containts ilegal words
            public boolean testInput(String in) {
                //Test string for ilegal text
                in = in.toUpperCase();
                return in.contains("DROP TABLE") || in.contains("SELECT *");
            }

            //Load the back button to page
            public void loadBackButton(JspWriter out, String url, String loc) {
                try {
                    //Printing back button
                    out.println("<form action=" + url + " method='post'>");
                    out.println("<input type='submit' value='Back to " + loc
                            + "' class='btn-back'>");
                    out.println("</form>");
                } catch (Exception e) {
                }
            }

            //Load log-off and edit details buttons to page
            public void loadButtons(JspWriter out) {
                try {
                    //Printing log-off and edit details button
                    out.println("<form action=chat.jsp method='post'>");
                    out.println("<input type=submit value='Log off' name='logOff'"
                            + " class='btn-logoff'>");
                    out.println("<input type=submit value='Edit details' name='edit'"
                            + " class='btn-edit'>");
                    out.println("</form>");
                } catch (Exception e) {
                }
            }

            //Load create topic interface to page
            public void loadCreate(JspWriter out, String topicName, 
                    String topicDescrip, String message) {
                try {
                    //Printing create topic text box 
                    out.println("<br><form action='chat.jsp' class='create-topic'"
                            + " method='post'>");
                    out.println("<b>New topic</b><br>");
                    if (message.isEmpty()) {
                        out.println("<br>");
                    } else {
                        out.println(message + "<br>");
                    }
                    out.println("Topic name/title:<br>");
                    out.println("<input type='text' name='newTopic' value='"
                            + topicName + "' maxlength='35'> <br>");
                    out.println("Topic description:<br>");
                    out.println("<textarea name='descrip' maxlength='60'>"
                            + topicDescrip + "</textarea><br>");
                    out.println("<input type='submit' value='Create topic' "
                            + "name='topicSubmit' class='btn-create'>");
                    out.println("</form>");
                } catch (Exception e) {
                }
            }
                                
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
      			"errorPage.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      client.DatabaseConnectClient connection = null;
      synchronized (session) {
        connection = (client.DatabaseConnectClient) _jspx_page_context.getAttribute("connection", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (connection == null){
          connection = new client.DatabaseConnectClient();
          _jspx_page_context.setAttribute("connection", connection, javax.servlet.jsp.PageContext.SESSION_SCOPE);
          out.write("\n");
          out.write("    ");
          out.write('\n');
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Topic Wiz Forum</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"chatCSS.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <h1>Topic Wiz</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");

                //Getting button information
                String tempName = (String) session.getAttribute("user");
                String tempTopic = request.getParameter("topic");
                String tempNew = request.getParameter("topicSubmit");
                String tempComment = request.getParameter("comment");
                String rem = request.getParameter("remove");
                String send = request.getParameter("send");
                String edit = request.getParameter("edit");
                String logOff = request.getParameter("logOff");
                connection.start();
                //Checking if login name is valid
                if (tempName != null && !tempName.equals("")) {
                    connection.executeQuery("SELECT eMail FROM users "
                            + "WHERE nameAndSur = '" + tempName + "'");
                    if (connection.next()) {
                        name = tempName;
                        eMail = (String) connection.getNext(1);
                    } else {
                        response.sendRedirect("login.jsp");
                    }
                } else {
                    response.sendRedirect("login.jsp");
                }
                //Checking which button is pressed
                if (tempTopic != null) {
                    //Loading comments
                    comment = tempTopic;
                    loadComments(out, connection);
                    sendInter(out, "");
                } else if (tempNew != null) {
                    loadButtons(out);
                    String topic = request.getParameter("newTopic");
                    String descrip = request.getParameter("descrip");
                    String message;
                    if (testInput(descrip) || testInput(tempNew)) {
                        message = "<red>Please input valid values.</red>";
                    } else {
                        connection.reset();
                        //Adding topic to database
                        int re = connection.executeUpdate("INSERT topics "
                                + "VALUES ('" + eMail + "', '" + topic + "', '"
                                + descrip + "', GETDATE())");
                        if (re == 0) {
                            message = "<red>Topic could not be added.</red>";
                        } else {
                            message = "<green>Topic added successfully.</green>";
                            topic = "";
                            descrip = "";
                        }
                    }
                    //Loading topics
                    loadTopics(out, connection);
                    loadCreate(out, topic, descrip, message);
                } else if (tempComment != null) {
                    //Loading comments
                    reply = tempComment;
                    loadComments(out, connection);
            
      out.write("\n");
      out.write("            <form action=\"chat.jsp\" method='post'>\n");
      out.write("                <input type=\"submit\" value=\"Remove reply\" name=\"remove\" class=\"btn-remove\">\n");
      out.write("            </form>\n");
      out.write("            ");

                    sendInter(out, "");
                } else if (rem != null) {
                    //Loading comments
                    reply = "";
                    loadComments(out, connection);
                    sendInter(out, "");
                } else if (send != null) {
                    String message = request.getParameter("message");
                    String status = "";
                    if (testInput(message)) {
                        status = "<red>Please input valid message.</red>";
                    } else {
                        connection.reset();
                        if (reply.isEmpty()) {
                            //Sending comment
                            int re = connection.executeUpdate("INSERT comments "
                                    + "VALUES (" + comment + ", '" + eMail + "', '"
                                    + message + "', GETDATE())");
                            if (re == 0) {
                                status = "<red>Message could not be send.</red>";
                                connection.log(eMail + " commented on topic "
                                        + topicName + " [fail]");
                            } else {
                                connection.log(eMail + " commented on topic " + topicName);
                                message = "";
                            }
                        } else {
                            //Sending reply
                            int re = connection.executeUpdate("INSERT replys "
                                    + "VALUES (" + reply + ", '" + eMail + "', '"
                                    + message + "', GETDATE())");
                            if (re == 0) {
                                status = "<red>Message could not be send.</red>";
                                connection.log(eMail + " replyed on comment "
                                        + reply + " of topic " + topicName + " [fail]");
                            } else {
                                connection.log(eMail + " replyed on comment "
                                        + reply + " of topic " + topicName);
                                message = "";
                            }
                        }
                        reply = "";
                    }
                    //Loading comments
                    loadComments(out, connection);
                    if (status.isEmpty()) {
                        out.println(status);
                    }
                    sendInter(out, message);
                } else if (logOff != null) {
                    //Loading login screen
                    session.setAttribute("user", null);
                    response.sendRedirect("login.jsp");
                } else if (edit != null) {
                    //Loading edit details page
                    session.setAttribute("user", name);
                    response.sendRedirect("editDetails.jsp");
                } else {
                    //Load buttons and topics
                    loadButtons(out);
                    loadTopics(out, connection);
                    loadCreate(out, "", "", "");
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
