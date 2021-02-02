<html>
    <head>
          <title>Apna Mess.comt</title>
<meta charset="utf-8">

<script src="js/jquery-1.7.1.minjs" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
    </head>
    
    <center>
        <body bgcolor="orange">
    <header>
  <div class="row-top">
    <div class="main">
      <div class="wrapper">
        <h1><a href="index.jsp">Apna Mess<span>.com</span></a></h1>
        <nav>
          <ul class="menu">
             
        </nav>
      </div>
    </div>
  </div>
     <div class="row-bot">
    <div class="row-bot-bg">
      <div class="main">
        <h2>Impressive Selection <span>for any Occasion</span></h2>
      </div>
    </div>
  </div>
</header>
        </body>
    </center>
    
    
     </br><br></br><br></br><br>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
//String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "messbooking";


try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<h2 align="center" ><font color="red"><strong>List of order</strong></font></h2>
<center>
<table align="center" cellpadding="5" cellspacing="5" border="white">



<tr bgcolor="#A52A2A">
<td><b>Order Id</b></td>
<td><b>Mess Id</b></td>
<td><b>Plate Id</b></td>
<td><b>Quantity</b></td>
<td><b>date</b></td>
<td><b>Total Amount</b></td>
<td><b>Status</b></td>
<td><b>Delete</b></td>


</tr>

<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, "root", "root");
statement=connection.createStatement();
String sql ="select * from mess_order";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="red">

<td><%=resultSet.getString("Order_id") %></td>
<td><%=resultSet.getString("Mess_Id") %></td>
<td><%=resultSet.getString("Plate_id") %></td>
<td><%=resultSet.getInt("Quantity") %></td>
<td><%=resultSet.getString("Date") %></td>
<td><%=resultSet.getInt("Total_Amount") %></td>
<td><%=resultSet.getString("Status") %></td>

<td>  <a href="./OrderDeleteList?o_id=<%=resultSet.getString("Order_id")%>"> Delete</a></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>

</table>
</center>
</br><br></br><br></br><br></br>
<center>
 <%@include file="footer.jsp"%>
</center>
 </html>