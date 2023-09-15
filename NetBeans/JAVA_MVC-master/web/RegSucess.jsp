<%-- 
    Document   : newjspRegSucess
    Created on : May 18, 2019, 6:34:00 AM
    Author     : SUPER ANDROID
--%>

<%@page import="Model_Bean.Bean"%>
<%@page import="org.jboss.weld.context.http.Http"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Sucessfully</title>
    </head>
    <body>
        <%
            HttpSession sessobj = request.getSession(false);
            String user = (String) sessobj.getAttribute("username");
            //Bean beansessobj = new Bean();
           // beansessobj.setUname(user);
           /// beansessobj.getUname();
            out.print("Welcome Register Sucessfully");
            out.print(" ");
            out.print(user);
            out.print(" ");
            %>
        <br><br>
        <a href="index.jsp">OK</a>
        <br><br>
    </body>
</html>