/*
 Name:           Server
 Description     The Server contains all the methods to communicate with database and web service and all data proccesses.
 Author:         Schalk Mouton
 Date:           26 July 2018
 */
package Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

//Main class for server, that contains all the operation methods.
@WebService(serviceName = "Server")
public class Server {

    //Connection variable to create connection.
    Connection connectionForum;

    //Connect to database to be able to check username & password, and retrieve/update information in database.
    @WebMethod(operationName = "connect")
    public void connect() {
        try {
            //Create connection with ODBC driver.
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //Connect to Forum database on ODBC driver.
            connectionForum = DriverManager.getConnection("jdbc:odbc:Forum");
        } catch (ClassNotFoundException | SQLException exception) {
            //Catches any exception.
            System.out.println("Connection Error..." + exception);
        }
    }

    //Method to close the connection with the database.
    @WebMethod(operationName = "disconnect")
    public void disconnect() {
        try {
            //Closes the connection.
            connectionForum.close();
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("disconnect Error..." + exception);
        }
    }

    //Method to add a new user.
    @WebMethod(operationName = "register")
    public boolean register(@WebParam(name = "uName") String uName, @WebParam(name = "pWord") String pWord, @WebParam(name = "email") String email, @WebParam(name = "securityA") String securityA, @WebParam(name = "gender") String gender) {
        //create boolean variable to indicate wether user may be added.
        boolean valid = false;
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //Insert data into user table
            sm.executeUpdate("INSERT INTO Users (Username, Password, EmailAddress, SecurityAnswer, Gender) VALUES('" + uName + "','" + pWord + "','" + email + "','" + securityA + "','" + gender + "')");
            //change boolean variable to true.
            valid = true;
            //return boolean value
            return valid;
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("Register Error..." + exception);
            //change boolean variable to false.
            valid = false;
            //return boolean value
            return valid;
        }
    }

    //Method checks if the login details entered exists and are correct.
    @WebMethod(operationName = "checkDetails")
    public Boolean checkDetails(@WebParam(name = "uName") String uName, @WebParam(name = "pWord") String pWord) {
        //create boolean variable to indicate weathe the details are valid or not.
        boolean valid = false;
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //Get all the data from the user table.
            ResultSet rs = sm.executeQuery("SELECT * FROM Users");
            //Run through all the records in database to see if details exist.
            while (rs.next()) {
                //check if details matches 
                if (uName.equals(rs.getString(1)) && pWord.equals(rs.getString(2))) {
                    //If correct change boolean variable to true.
                    valid = true;
                }
            }
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("Check Details Error..." + exception);
        }
        //return boolean value
        return valid;
    }

    @WebMethod(operationName = "getPWord")
    public String getPWord(@WebParam(name = "email") String email, @WebParam(name = "securityA") String securityA) {
        //Create string variable to return.
        String pWord = null;
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //Select all the data in the user table where the email matches the email entered.
            ResultSet rs = sm.executeQuery("SELECT * FROM Users WHERE EmailAddress = '" + email + "'AND SecurityAnswer = '" + securityA + "'");
            if (rs.next()) {
                //Get the password row in the table and store it in return pWord variable.
                pWord = "Youre password is: " + rs.getString(2);
            } else {
                pWord = "No password found!";
            }
            //Return string.
            return pWord;
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("getPWord Error..." + exception);
            //Return string.
            return "Error";
        }
    }

    //Method to retrieve user's info from the database.
    @WebMethod(operationName = "retrieveInfo")
    public ArrayList retrieveInfo(@WebParam(name = "uName") String uName) {
        ArrayList<String> info = new ArrayList();
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //Select all the data in the user table where the username matches the username entered.
            ResultSet rs = sm.executeQuery("SELECT * FROM Users WHERE Username = '" + uName + "'");
            if (rs.next()) {
                //Get the info of user in the table and store it in arraylist variable.
                info.add(rs.getString(1));
                info.add(rs.getString(2));
                info.add(rs.getString(3));
                info.add(rs.getString(4));
                info.add(rs.getString(5));
            }
            //Return arraylist with user's details.
            return info;
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("retrieveInfo Error..." + exception);
            //return empty Arraylist
            return info;
        }

    }

    //Method to update user's info to the database.
    @WebMethod(operationName = "updateInfo")
    public boolean updateInfo(@WebParam(name = "uName") String uName, @WebParam(name = "pWord") String pWord, @WebParam(name = "email") String email, @WebParam(name = "securityA") String securityA, @WebParam(name = "gender") String gender) {
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //Update details in database.
            sm.executeUpdate("Update Users SET Password='" + pWord + "', EmailAddress='" + email + "', SecurityAnswer= '" + securityA + "', Gender='" + gender + "' WHERE Username='" + uName + "'");
            //return boolean value
            return true;
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("UpdateInfo Error..." + exception);
            //return boolean value
            return false;
        }

    }

    //Method to retrieve the topics from the database.
    @WebMethod(operationName = "retrieveTopics")
    public ArrayList retrieveTopics() {
        //Creates an arraylist to return.
        ArrayList<String> topics = new ArrayList();
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //selects fields from database
            ResultSet rs = sm.executeQuery("SELECT * FROM Topics");
            //Add topics to arrayList.
            while (rs.next()) {
                topics.add(rs.getString(1) + "#./" + rs.getString(2) + "#./" + rs.getString(3) + "#./" + rs.getString(4));
            }
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("retrieveTopics Error..." + exception);
        }
        //Return arrayList
        return topics;
    }

    //Method to add a topic in the database.
    @WebMethod(operationName = "postTopic")
    public boolean postTopic(@WebParam(name = "title") String title, @WebParam(name = "description") String description, @WebParam(name = "date") String date) {
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //inserts into database
            sm.executeUpdate("INSERT INTO Topics(Title, Description, TopicDate) VALUES ('" + title + "','" + description + "','" + date + "')");
            //Return true.
            return true;
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("postTopic Error..." + exception);
            //Return false.
            return false;
        }
    }

    //Method to retrieve the comments from the database.
    @WebMethod(operationName = "retrieveComments")
    public ArrayList retrieveComments() {
        //Creates an arraylist to return.
        ArrayList<String> comments = new ArrayList();
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //selects fields from database
            ResultSet rs = sm.executeQuery("SELECT * FROM Comments");
            //Add comments to arrayList.
            while (rs.next()) {
                comments.add(rs.getString(1) + "#./" + rs.getString(2) + "#./" + rs.getString(3) + "#./" + rs.getString(4) + "#./" + rs.getString(5));
            }
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("retrieveComments Error..." + exception);
        }
        //Return arrayList
        return comments;
    }

    //Method that runs when user commented, and to store the comment on the database..
    @WebMethod(operationName = "postComment")
    public boolean postComment(@WebParam(name = "comment") String comment, @WebParam(name = "date") String date, @WebParam(name = "uName") String uName, @WebParam(name = "topicID") String topicID) {
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //Inserts data into database
            sm.executeUpdate("INSERT INTO Comments (Comment, CommentDate, Username, TopicID) VALUES ('" + comment + "','" + date + "','" + uName + "','" + topicID + ")'");
            return true;
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("postComment Error..." + exception);
            return false;
        }

    }

    //Method to retrieve the replies from the database.
    @WebMethod(operationName = "retrieveReplies")
    public ArrayList retrieveReplies() {
        //Creates an arraylist to return.
        ArrayList<String> replies = new ArrayList();
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //selects fields from database
            ResultSet rs = sm.executeQuery("SELECT * FROM Replies");
            //Add replies to arrayList.
            while (rs.next()) {
                replies.add(rs.getString(1) + "#./" + rs.getString(2) + "#./" + rs.getString(3) + "#./" + rs.getString(4) + "#./" + rs.getString(5));
            }
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("retrieveReplies Error..." + exception);
        }
        //Return arrayList
        return replies;
    }

    //Method that runs when user replied, and to store the reply on the database..
    @WebMethod(operationName = "postReply")
    public boolean postReply(@WebParam(name = "reply") String reply, @WebParam(name = "date") String date, @WebParam(name = "uName") String uName, @WebParam(name = "commentID") String commentID) {
        try {
            //Connect by running the "connect" method.
            connect();
            //Create statement.
            Statement sm = connectionForum.createStatement();
            //Inserts data into database
            sm.executeUpdate("INSERT INTO Replies (Reply, ReplyDate, Username CommentID) VALUES ('" + reply + "','" + date + "','" + uName + "','" + commentID + ")'");
            return true;
        } catch (Exception exception) {
            //Catches any exception.
            System.out.println("postReply Error..." + exception);
            return false;
        }

    }

}
