<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        #wrap {
	width:100%;
       height: 130px;
	overflow:hidden;
      
        
}
 #wrap1 {
	width:100%;
       height: 70px;
	overflow:hidden;
      
        
}
        ul li
        {
            position: relative;
            position: center;
        }
        ul li ul
        {
            display:none;
             
            position: absolute;
            width: 150px;
           
        }
        ul li:hover ul
        {
            display: block;
            
        }
        #subli
        {
            display: inline;
        }
        #subul
        {
            margin-left: -40px;
            
        }
    </style>
<title>Catering.com</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/jquery.cycle.all.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<script src="js/tms-0.3.js" type="text/javascript"></script>
<script src="js/tms_presets.js" type="text/javascript"></script>
<script src="js/jquery.easing.1.3.js" type="text/javascript"></script>
<script src="js/jquery.equalheights.js" type="text/javascript"></script>
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
<script>
    $(document).ready(function ()
    {
       $(".slider1").cycle(); 
    });
    
</script>
</head>
<body id="page1">
<!--==============================header=================================-->
<header>
  <div class="row-top">
    <div class="main">
        <div class="wrapper" id="wrap">
        <h1><a href="index.jsp">Catering<span>.com</span></a></h1>
        <nav>
          <ul class="menu">
              <li><a class="active" href="index.jsp">Home</a></li>
              <li><a href="menu.jsp">Menu</a>
                  <ul id="subul">
                      <li id="subli"><a href="SimplePlate.jsp">Simple plate</a></li>
                      <li id="subli"><a href="DeliciousPlate.jsp">Delicious Plate</a></li>
                      <li id="subli"><a href="SpecialPlate.jsp">Special plate</a></li>
                  </ul>
                </li>
              <li><a href="userlogin.jsp">Login</a></li>
              <li><a href="HomeContact.jsp">Contact</a></li>
          </ul>
        </nav>
      </div>
    </div>
  </div>
    <div class="row-bot">
    <div class="row-bot-bg">
      <div class="main">
        <h2>Impressive Selection <span>for any Occasion</span></h2>
        <div class="slider-wrapper">
          <div class="slider1">
              <img src="images/kapil4.jpg" alt="" style="height:466px;width:940px"/>
           </div>
        </div>
      </div>
    </div>
    </div><br>
</header>
<footer>
  <div class="main">
    <div class="aligncenter"> <span>Copyright &copy; 2016 <a href="#">Catering.com </a> All Rights Reserved</span></div>
  </div>
</footer>
<script type="text/javascript">Cufon.now();</script>
<script type="text/javascript">
$(window).load(function () {
    $('.slider')._TMS({
        duration: 1000,
        easing: 'easeOutQuint',
        preset: 'slideDown',
        slideshow: 7000,
        banners: false,
        pauseOnHover: true,
        pagination: true,
        pagNums: false
    });
});
</script>
      