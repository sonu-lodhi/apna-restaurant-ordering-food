<%-- 
    Document   : MessRegistration
    Created on : Apr 23, 2017, 10:15:40 AM
    Author     : kapiltank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="ViewProfile.jsp"%>
    </head>
    <body>
        <br><br><br><br><br>
         <form action="./MessRegistration">
             <center>
            <table>
                
                <tr>
                    <td> Mess Name</td>
                    <td><input type="text" name="mess_name"></td>
                </tr>
                <tr>
                    <td> Mess Owner Name </td>
                    <td><input type="text" name="mess_owner_name"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="mess_address"></td>
                </tr>
                <tr>
                    <td> Location</td>
                    <td><input type="text" name="mess_location"></td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td><input type="text" name="mess_contact"></td>
                </tr>
                <tr>
                    <td>E-mail</td>
                    <td><input type="text" name="mess_email"></td>
                </tr>
               
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="mess_password"></td>
                </tr>
                <tr>
                    <td><input type="Submit" value="Register"></td>
                </tr>
            </table>
             </center>
        </form>
    </body>
    </br></br></br></br></br></br> <%@include file="footer.jsp"%>
</html>
