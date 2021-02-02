<%-- 
    Document   : contact
    Created on : Nov 23, 2015, 2:33:22 PM
    Author     : Administrator
--%>
<%@page import="java.sql.*"%>
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
        <h1><a href="index.jsp">ApnaMess<span>.com</span></a></h1>
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
<!--==============================content================================-->
<section id="content">
  <div class="main">
    <div class="wrapper">
      
      <article class="col-2">
        <center><h3 class="p1"> Change Password</h3>
		<div align="center" style="font-size:18px; color:#0000FF">
        <p class="p1"> 
		<form id="form1" name="form1" action="./ChangePassword" >&nbsp;  
              
		  <label>Enter Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; 
                      <input type="password"  name="pass" value="" >
             </label><br>
			<br>   <label>Enter Confirm password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; 
                               <input type="password"  name="cpass" value="" >
             </label>
                    <input type="hidden" name="email" value="<%= request.getParameter("email")%>">

                    <p>&nbsp;</p>
		    <div id="container" style="width: 330px;">
				  <div class="button-row"> 
             <label> 
             <input type="submit" name="Submit" value="ChangePassword"/>
             </label></div></div>
             
            
           </form>
                </div>
      </article>
    </div>
  </div>
</section>
<!--==============================footer=================================-->
<footer>
  <div class="main">
     <div class="aligncenter"> <span>Copyright &copy; 2016 <a href="#">Apna Mess.com</a> All Rights Reserved</span></div>
  </div>
</footer>
<script type="text/javascript">Cufon.now();</script>
</body>
</html>
