<%-- 
 Document:      PasswordRecovery
 Description:   The PasswordRecovery page is to help users retrieve their password, incase they forgot it.
 Author:        Schalk Mouton
 Date:          26 July 2018
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Password Recovery</title>
        <style>
            body{
                background-image: url(Resources/Background.jpg);
                background-size: cover;
                background-repeat: no-repeat scroll;
            }
            #forgotBox{
                position: fixed;
                top: 10%;
                left: 37%;
                width: 25%;
                height: auto; 
                background-color: #f2f2f2;
                border-radius: 40px;
                padding: 1%;
                opacity: 0.95;
            }
            label{
                position: relative;
                left: 5%;
                height: 4px;
                display: block;
                font-weight: bold;
            }
            #heading{
                font-size: 200%;
                height: 60px;
                font-family: Forte;
            }
            input {
                position: relative;
                width: 90%;
                padding: 2%;
                margin: 3%;
                display: block;
                border: 1px solid #ccc;
                border-radius: 10px;
                box-sizing: border-box;
            }
            #retrieveBut {
                width: 40%;
                padding: 3%;
                margin-left: 5%;
                height: auto;
                background-color: #008CBA;
                border: none;
                display: inline;
                border-radius: 4px;
                cursor: pointer;
                font-weight: bold;
            }
            #loginBut {
                width: 40%;
                padding: 3%;
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
        <div id="forgotBox">
            <form action="Recover" method="post">
                <label ID="heading">Password Recovery</label>
                <label for="email">Email Address</label>
                <input type="text" id="email" name="email" placeholder="Enter email">
                <label for="sAnswer">Security answer:</label>
                <input type="text" id="sAnswer" name="sAnswer" placeholder="Enter your favourate color">
                <input id="retrieveBut" type="submit" value="Retrieve">
                <input id="loginBut" type="submit" value="Login" formaction="Login.jsp">
            </form>
        </div>
    </body>
</html>
