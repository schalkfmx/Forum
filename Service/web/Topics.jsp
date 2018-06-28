<%-- 
 Document:      Topics
 Description:   The Topics page servers as a home page where users can read, post and comment on topics.
 Author:        Schalk Mouton
 Date:          26 July 2018
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Topics</title>
        <style>
            body{
                background-image: url(Resources/Background.jpg);
                background-size: cover;
                background-repeat: no-repeat scroll;
            }
            #topicBox{
                position: fixed;
                top: 20px;
                left: 20%;
                width: 55%;
                height: 100%; 
                background-color: #f2f2f2;
                border-radius: 40px;
                padding: 2%;
                opacity: 0.9;
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
            #But {
                width: 40%;
                height: auto;
                background-color: #4CAF50;
                border: none;
                display: inline;
                border-radius: 4px;
                cursor: pointer;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div id="topicBox">
            <label ID="heading">Topics</label>
        </div>
    </body>
</html>