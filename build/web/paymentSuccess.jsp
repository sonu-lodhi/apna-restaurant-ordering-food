<%-- 
    Document   : paymentSuccess
    Created on : May 9, 2017, 1:07:08 PM
    Author     : kapiltank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String item_no            = request.getParameter("item_number");
// String item_transaction   = request.getParameter("tx"); // Paypal transaction ID
//String item_price         = request.getParameter("amt"); // Paypal received amount
//String item_currency      = request.getParameter("cc"); // Paypal received currency type

String price = "10";
String currency="USD";

//Rechecking the product price and currency details
if(item_price.equals( price) && item_currency.equals(currency))
{
    out.print ("<h1>Welcome, Guest</h1>");
    out.print ( "<h1>Payment Successful</h1>");
}
else
{
    out.print ("<h1>Payment Failed</h1>");
}
%>