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
         <form action="./OList">
             <center>
            <table>
                
                <tr>
                    <td>Order Id</td>
                    <td><input type="text" name="o_id"></td>
                </tr>
                <tr>
                    <td> Mess Id </td>
                    <td><input type="text" name="m_id"></td>
                </tr>
                <tr>
                    <td>Plate Id</td>
                    <td><input type="text" name="p_id"></td>
                </tr>
                <tr>
                    <td> Quantity </td>
                    <td><input type="text" name="qua"></td>
                </tr>
                <tr>
                    <td>Date</td>
                    <td><input type="text" name="date"></td>
                </tr>
                <tr>
                    <td>Total Amount</td>
                    <td><input type="text" name="t_amount"></td>
                </tr>
               
                <tr>
                    <td>Status</td>
                    <td><input type="text" name="st"></td>
                </tr>
                <tr>
                    <td><input type="Submit" value="Submit"></td>
                </tr>
            </table>
             </center>
        </form>
    </body>
    </br></br></br></br></br></br> <%@include file="footer.jsp"%>
</html>
