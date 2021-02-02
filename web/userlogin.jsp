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


<Script language="javascript" type="text/javascript">
    window.history.forward();
    function noback()
    {
        window.history.forward();
    }
    </script>
    
</head>
<body id="page6" onLoad="noBack();" 
          onpageshow="if(event.presisted) noBack();" onUnLoad="">
    
    
 
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
      <article class="col-1">
        <div class="indent-left">
          <h3 class="p1">Our cooking style </h3>
          <figure class="indent-bot">
          <img src="images/kapil2.jpg" width="252" height="188">          </figure>
          <dl>
            <dt class="p1">MG ROAD , Indore (M.P)</dt>
            <dd><span>Telephone:</span> +919770201337</dd>
            <dd><span>Email:</span><a class="color-2" href="#">ApnaMess@gmail.com</a></dd>
          </dl>
        </div>
      </article>
      <article class="col-2">
        <h3 class="p1"> For Real Tasty Contact Us.....</h3>
		<div align="center" style="font-size:18px; color:#0000FF">
        <p class="p1"> 
		<form id="form1" name="form1"  action="UserLogin" >&nbsp;  
              
			   <label>User Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; 
                               <input type="text"  name="user_id" value="" >
             </label>
            <p>&nbsp;</p>
            <label> Password
             &nbsp;&nbsp;&nbsp;
             <input type="password"  name="user_password"  value="">
             </label>
            <p>&nbsp;</p>
		    <div id="container" style="width: 330px;">
				  <div class="button-row"> 
             <label> 
             <input type="submit" name="Submit" value="LOGIN" onClick="msg()" />
             </label></div></div>
             
             <label></label><p>&nbsp;</p>
           <p>&nbsp;</p>
           <a href="ForgetPassword.jsp"  style="color:#003366; font-family:Forte">FORGOT PASSWORD ?</a><br/><br/>					
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
