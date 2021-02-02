<%-- 
    Document   : payment
    Created on : May 9, 2017, 12:56:41 PM
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
       <% 
String paypal_url="https://www.sandbox.paypal.com/cgi-bin/webscr"; // Test Paypal API URL
String paypal_id="php1pmbatch-facilitator@gmail.com"; // Business email ID
%>
<!--<h4>Welcome, Guest</h4>-->

<div class="product">            
<!--    <div class="image">
        <img src="h5ttp://www.phpgang.com/wp-content/uploads/gang.jpg" />
    </div>
    <div class="name">
        PHPGang Payment
    </div>
    <div class="price">
        Price:$10
    </div>-->

    <div class="btn">
    <form action="<%= paypal_url %>" method="post" name="frmPayPal1">
    <input type="hidden" name="business" value="<%= paypal_id %>">
    <input type="hidden" name="cmd" value="_xclick">
    <input type="hidden" name="item_name" value="PHPGang Payment">
    <input type="hidden" name="item_number" value="<%= "2" %>">
    <input type="hidden" name="credits" value="510">
    <input type="hidden" name="userid" value="<%= "12"%>">
    <input type="hidden" name="amount" value="<%= "20"%>">
    <input type="hidden" name="cpp_header_image" value="http://www.phpgang.com/wp-content/uploads/gang.jpg">
    <input type="hidden" name="no_shipping" value="1">
    <input type="hidden" name="currency_code" value="USD">
    <input type="hidden" name="handling" value="0">
    <input type="hidden" name="cancel_return" value="http://localhost:8080/ApnaMess/paymentCancel.jsp">
    <input type="hidden" name="return" value="http://localhost:8080/ApnaMess/paymentSuccess.jsp?item_number='2'">
    <input type="image" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
    <img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">
    </form> 
    </div>
</div>
    </body>
</html>
