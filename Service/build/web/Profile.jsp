<%-- 
 Document:      MyProfile
 Description:   The MyProfile page is where an user will change their personal info or password.
 Author:        Schalk Mouton
 Date:          26 July 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>My Profile</title>
        <style>
            body{
                background-image: url(Resources/Background.jpg);
                background-size: cover;
                background-repeat: no-repeat scroll;
            }
            #profileBox{
                position: fixed;
                top: 20px;
                left: 20px;
                width: 40%;
                height: 85%; 
                background-color: #f2f2f2;
                border-radius: 40px;
                padding: 1%;
                opacity: 0.95;
            }
            label{
                position: relative;
                margin: 1%;
                left: 5%;
                height: auto;
                display: block;
                font-weight: bold;
            }
            #heading{
                font-size: 190%;
                height: 60px;
                font-family: Forte;
            }
            input {
                position: relative;
                width: 50%;
                padding: 1.5%;
                margin: 2%;
                margin-left: 6%;
                display: block;
                border: 1px solid #ccc;
                border-radius: 10px;
                box-sizing: border-box;
            }
            #genderUl {
                list-style: none;
                margin: 1%;
                margin-left: 5%;
                margin-bottom: 10%;
                padding: 1%;
            }
            #genderLi {
                display: inline-block;
                position: relative;
                float: left;
                width: 25%;
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
            #updateBut {
                float: right;
                width: 20%;
                height: auto;
                background-color: #008CBA;
                margin: 0%;
                margin-right: 5%;
                border: none;
                display: inline;
                border-radius: 4px;
                cursor: pointer;
                font-weight: bold;
            }
            #topicsBut {
                width: 20%;
                height: auto;
                background-color: #f44242;
                margin: 5%;
                border: none;
                display: inline;
                border-radius: 4px;
                cursor: pointer;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div id="profileBox">
            <form action="updateProfile" method="post">
                <input id="topicsBut" type="submit" value="Return to Topics" formaction="Topics.jsp">
                <label ID="heading">My Profile</label>
                <label for="uName">Username:</label>
                <input type="text" id="uName" name="uName">
                <label for="pWord">Password:</label>
                <input type="password" id="pWord" name="pWord">
                <label for="email">Email Address</label>
                <input type="text" id="email" name="email">
                <label for="sAnswer">Whats your favourite color?</label>
                <input type="text" id="sAnswer" name="sAnswer">
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
                <input id="updateBut" type="submit" value="Update">
            </form>
        </div>
    </body>
</html>