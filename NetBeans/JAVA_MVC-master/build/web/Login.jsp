<%-- 
    Document   : Login
    Created on : May 4, 2019, 7:24:17 AM
    Author     : SUPER ANDROID
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="Controller_Login" method="post">
            <h3>Username:</h3> <input type="text" name ="username"/>
            <h3>Password:</h3> <input type="password" name ="pass"/>
            <div>
            <input type="submit" name ="submit" value="Login"/>
            </div>
        </form>
        </body>
</html>
