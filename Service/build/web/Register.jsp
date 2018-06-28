<%-- 
 Document:      Register
 Description:   The Register page is where a new user will sign up for an account to use on the Forum.
 Author:        Schalk Mouton
 Date:          26 July 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Register</title>
        <style>
            body{
                background-image: url(Resources/Background.jpg);
                background-size: cover;
                background-repeat: no-repeat scroll;
            }
            #registerBox{
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
            #genderUl {
                list-style: none;
                margin: 3%;
                margin-bottom: 10%;
                padding: 1%;
            }
            #genderLi {
                display: inline-block;
                position: relative;
                float: left;
                width: 50%;
            }
            .genderLabel {
                display: inline;
                position: relative;
                margin-left: 20%;
            }
            input[type=radio] {
                position: absolute;
                float: left;
                height: 110%;
                width: 15%;
                background-color: #eee;
                border-radius: 50%;
                margin-top: -1%;
            }
            #registerBut {
                width: 40%;
                height: auto;
                background-color: #4CAF50;
                border: none;
                display: inline;
                border-radius: 4px;
                cursor: pointer;
                font-weight: bold;
            }
            #loginBut {
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
        <div id="registerBox">
            <form action="Register" method="post">
                <label ID="heading">Register</label>
                <label for="uName">Username:</label>
                <input type="text" id="uName" name="uName" placeholder="Enter a username">
                <label for="pWord">Password:</label>
                <input type="password" id="pWord" name="pWord" placeholder="Enter password">
                <label for="email">Email Address</label>
                <input type="text" id="email" name="email" placeholder="Enter your email">
                <label for="sAnswer">Whats your favourite color?</label>
                <input type="text" id="sAnswer" name="sAnswer" placeholder="Enter answer here">
                <label for="gender">Gender:</label>
                <ul id="genderUl">
                    <li id="genderLi">
                        <input type="radio" id="Male" name="gender">
                        <label for="Male" class="genderLabel">Male</label>
                    </li>
                    <li id="genderLi">
                        <input type="radio" id="Female" name="gender">
                        <label for="Female" class="genderLabel">Female</label>
                    </li>
                </ul>
                <input id="registerBut" type="submit" value="Register">
                <input id="loginBut" type="submit" value="Login" formaction="Login.jsp">
            </form>
        </div>
    </body>
</html>