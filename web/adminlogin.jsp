<%-- 
    Document   : adminlogin
    Created on : Apr 24, 2017, 1:35:22 PM
    Author     : kapiltank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./AdminRegister" method="post">
            <table align="center" border="5">
                <tr>
                    <td>Admin Id : </td>
                    <td><input type="text" name="admin_id"></td>
                </tr>
                <tr>
                    <td>Admin Password : </td>
                    <td><input type="password" name="admin_password"></td>
                </tr>
                <tr>
                    <td><input type="Submit" value="Login"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
