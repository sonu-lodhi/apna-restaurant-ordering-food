<%-- 
    Document   : index
    Created on : Nov 21, 2015, 2:40:36 PM
    Author     : Administrator
--%>

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
        <h1><a href="index.jsp">Apna Mess<span>.com</span></a></h1>
        <nav>
          <ul class="menu">
              <li><a class="active" href="index.jsp">Home</a></li>
              <li><a href="">Menu</a>
                  <ul id="subul">
                      <li id="subli"><a href="SimplePlate.jsp">Simple Plate</a></li>
                      <li id="subli"><a href="DeliciousPlate.jsp">Delicious Plate</a></li>
                      <li id="subli"><a href="SpecialPlate.jsp">Special Plate</a></li>
                      
                  </ul>
              
              </li>
              <li><a href="UserRegistration.jsp">User Registration</a></li>
              <li><a href="Location.jsp">Location</a></li>
              <li><a href="">Login</a>
                 <ul id="subul">
                     <li id="subul"><a href="Login.jsp">Admin Login</a></li><br>
                      
                     <li id="subul"><a href="userlogin.jsp">User Login</a></li><br>
                      <li id="subul"><a href="messlogin.jsp">Mess Login</a></li>
                 </ul>
                  
              </li>
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
              <img src="images/slide4.jpg" alt="" style="height:466px;width:940px"/>
              <img src="images/kapil3.jpg" class="image1" alt="" style="height:466px;width:940px"/>
              <img src="images/mess1.jpg" class="image1" alt="" style="height:466px;width:940px" />
<!--            <ul class="items">
              <li> <img src="images/mess3.jpg" alt="" class="image1"/> </li>
              <li> <img src="images/slider-img2.jpg" class="image1"
                        alt="" /> </li>
              <li> <img src="images/slider-img3.jpg" class="image1" alt="" /> </li>
            </ul>-->
          </div>
        </div>
      </div>
    </div>
  </div>
</header>
<!--==============================content================================-->
<section id="content">
  <div class="main">
    <div class="wrapper img-indent-bot">
      <article class="col-1"> <a href="#"><img class="img-border" src="images/mess1.jpg" alt="" height="220" width="320"></a> </article>
      <article class="col-1"> <a href="#"><img class="img-border" src="images/plate.jpg" alt="" height="220" width="320"></a> </article>
      <article class="col-2"> <a href="#"><img class="img-border" src="images/thali1.jpg" alt="" height="220" width="320"></a> </article>
    </div>
    <div class="wrapper">
      <article class="column-1">
        <div class="indent-left">
          <div class="maxheight indent-bot">
            <h3>Our Services</h3>
            <ul class="list-1">
              <li><a href="#">Tasty food are available as customer requirment. </a></li>
              <li><a href="#">Neat and clean environment are provided. </a></li>
              <li><a href="#">food prepare in neat and clean kitchen. </a></li>
              <li><a href="#">Home delivery are avaliable. </a></li>
              <li><a href="#">order of wedding are taken with minimum rates. </a></li>
              <li><a href="#">every kind of occassion order are taken . </a></li>
              <li><a href="#">Best Catering services are available here.... </a></li>
            </ul>
          </div>
          
      </article>
      <article class="column-2">
        <div class="maxheight indent-bot">
          <h3 class="p1">About the Catering</h3>
          <h6 class="p2">The wedding is remembered for the food, quality  and variety even after it is over. The conversation of the wedding and  generosity of the host is showcased by the food catered. We understand this  perfecly.</h6>
          <p>Therefore our menu is customized as per the need of season  and palette. The serving style showcased is our pride.We offer a wide variety of menus for every need and they can  be customized. You can select from our huge range of menus and dining ideas.</p>
          <p class="p2">&nbsp;</p>
          </div>
        
    </div>
  </div>
</section>
<!--==============================footer=================================-->
<footer>
  <div class="main" id="wrap1" >
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
</body>
</html>
