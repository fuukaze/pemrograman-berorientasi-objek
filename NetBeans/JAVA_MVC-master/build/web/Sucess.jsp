<%-- 
    Document   : Sucess
    Created on : May 4, 2019, 7:24:58 AM
    Author     : SUPER ANDROID
--%>

<%@page import="Model_Bean.Bean"%>
<%@page import="org.jboss.weld.context.http.Http"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <%
            HttpSession sessobj = request.getSession(false);
            String user = (String) sessobj.getAttribute("username");
            //Bean beansessobj = new Bean();
           // beansessobj.setUname(user);
           /// beansessobj.getUname();
            out.print("Welcome ");
            out.print(user);
            out.print(" ");


        %>
        <br><br>
        <a href="index.jsp">Log Out</a>
        <br><br>
    </body>
</html>
