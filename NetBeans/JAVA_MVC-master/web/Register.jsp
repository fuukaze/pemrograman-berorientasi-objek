<%-- 
    Document   : Register
    Created on : May 4, 2019, 7:24:33 AM
    Author     : SUPER ANDROID
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
       <form action="Controller_Register" method="post">
            <h3>Username:</h3> <input type="text" name ="username"/>
            <h3>Password:</h3> <input type="password" name ="pass"/>
            <div>
            <input type="submit" value="Sign up"/>
            </div>
        </form>
    </body>
</html>
