<%-- 
    Document   : AdminViewProfile
    Created on : Apr 28, 2017, 12:15:16 PM
    Author     : kapiltank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="ViewProfile.jsp"%>
    </head>
    
   <body bgcolor="">
   <center>
       <br><br><br><br><br><br><br><br><br>
           <form action="AdminViewProfile">
               
            <table border="10" align="center" bgcolor="">
                <tr>
                    <td> Password : </td>
                    <td><input type="password" name="pass"></td>
                </tr> 
                <tr>
                    <td> Change Password : </td>
                    <td><input type="password" name="c pass"></td>
                </tr>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <tr>
                    <td><input type="Submit" value="Submit"></td>
                </tr>
            </table>
         </form>
       </center>
    </body>
    <%@include file="footer.jsp" %>
</html>
