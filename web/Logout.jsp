<%-- 
    Document   : Logout
    Created on : Mar 14, 2016, 12:22:27 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
session.setAttribute("userid",null);
response.sendRedirect("Login.jsp");

%>
    </body>
</html>
