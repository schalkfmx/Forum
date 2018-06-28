<%-- 
 Document:      Login
 Description:   The Login page is the first page a user will see when the go onto the forum and where they can log into their account to view and attend in activities.
 Author:        Schalk Mouton
 Date:          26 July 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Log In</title>
        <style>
            body{
                background-image: url(Resources/Background.jpg);
                background-size: cover;
                background-repeat: no-repeat scroll;
            }
            #loginBox{
                position: fixed;
                top: 10%;
                left: 38%;
                width: 20%;
                height: auto; 
                background-color: #f2f2f2;
                border-radius: 40px;
                padding: 2%;
                opacity: 0.8;
            }
            label{
                position: relative;
                left: 5%;
                height: auto;
                display: block;
                font-weight: bold;
            }
            #heading{
                font-size: 200%;
                height: 60px;
                font-family: Forte;
            }
            #forgotPWord{
                display: block;
                font-weight: bold;
                font-size: 80%;
            }
            input {
                position: relative;
                width: 90%;
                padding: 3%;
                margin: 5%;
                display: block;
                border: 1px solid #ccc;
                border-radius: 10px;
                box-sizing: border-box;
            }
            #loginBut {
                width: 40%;
                height: auto;
                background-color: #4CAF50;
                border: none;
                display: inline;
                border-radius: 4px;
                cursor: pointer;
                font-weight: bold;
            }
            #registerBut {
                width: 40%;
                background-color: #f44242;
                margin: 3%;
                border: none;
                display: inline;
                border-radius: 4px;
                cursor: pointer;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div id="loginBox">
            <form action="loginServlet" method="post">
                <label ID="heading">LogIn</label>
                <label for="uName">Username:</label>
                <input type="text" id="uName" name="uName" placeholder="Enter username">
                <label for="pWord">Password:</label>
                <input type="password" id="pWord" name="pWord" placeholder="Enter password">
                <label id="forgotPWord"> <a href="PasswordRecovery.jsp">Forgot Password?</label>
                <input id="loginBut" type="submit" value="Login">
                <input id="registerBut" type="submit" value="Register" formaction="Register.jsp">
            </form>
        </div>
    </body>
</html>