<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Catering.com | Contact</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
</head>
<body id="page6">
<!--==============================header=================================-->
<header>
  <div class="row-top">
    <div class="main">
      <div class="wrapper">
        <h1><a href="index.jsp">Apna Mess<span>.com</span></a></h1>
        <nav>
          <ul class="menu">
          </ul>
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

<br><br><br><br><br><br><br>

<div align="center" style="font-size:18px; color:#0000FF">
        <table border="1" cellspacing="20px">
            <thead>
                <tr>
                    <th>Mess name</th>
                    <th>Mess Image</th>
                </tr>
            </thead>
<%
        Connection con = null;
        try {
            String Location = request.getParameter("loctn");
           //con =GetConnection.getConnection();
             Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
            String sql = "select * from mess_registration where Location =?";
            PreparedStatement ps = con.prepareStatement(sql);          
            ps.setString(1,Location);
            ResultSet rs = ps.executeQuery();
  //          out.print("<table border='1'><tbody><tr><td>Meass name</td><td>Mess Image</td></tr>");
            while(rs.next())
            {
                %>
<tbody>
                <tr>
                    <td><%= rs.getString("Mess_name")  %></td>
                    <td><%= rs.getString("Contact")%></td>
                    <td><a href="#" id="a" target="#res">Show Details</a>
                    </td>
                        <span id="res"><%= rs.getString("Address")%></span>
                   
                                   </tr>
            </tbody>
          <%  } 
            con.close();
        } catch (Exception e) {
            out.print("Login failed");
            e.printStackTrace();
        }

%>
            
        </table>

        
        
    
    </div>

<%@include file="footer.jsp"%>