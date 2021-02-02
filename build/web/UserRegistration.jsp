<%-- 
    Document   : MessRegistration
    Created on : Apr 23, 2017, 10:15:40 AM
    Author     : kapiltank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Apna Mess.comt</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="screen">
<script src="js/jquery-1.7.1.minjs" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Dynalight_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
        <script type="text/javascript">
function AllowAlphabet(){
if (!frm.nm.value.match(/^[a-zA-Z]+$/) && frm.nm.value !="")
{
frm.nm.value="";
frm.nm.focus();
alert("Please Enter only alphabets in text");
}

if (!frm.ui.value.match(/^[a-zA-Z]+$/) && frm.ui.value !="")
{
frm.ui.value="";
frm.ui.focus();
alert("Please Enter only alphabets in text");
}

}



function Validate() {
    var flag=true;
        var password = document.getElementById("u_pass").value;
        var confirmPassword = document.getElementById("u_c_pass").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            flag=false;
        }
        return flag;
    }
</script>

</head>
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
    
    <body>
        <br><br><br><br><br><br><br><br><br>
         <form action="./UserRegistration">
             <center>
            <table>
                
                <tr>
                    <td> User Name : </td>
                    <td><input type="text" name="u_name"></td>
                </tr>
                <tr>
                    <td> Password  : </td>
                    <td><input type="Password" name="u_pass" id="u_pass"></td>
                </tr>
                <tr>
                    <td> Confirm password  : </td>
                    <td><input type="password" name="u_c_pass" id="u_c_pass"></td>
                </tr>
                <tr>
                    <td> Contact  :</td>
                    <td><input type="text" name="u_contact"></td>
                </tr>
                
                <tr>
                    <td>E-mail</td>
                    <td><input type="text" name="u_email"></td>
                </tr>
                <tr>
                    <td><input type="Submit" value="Register" onclick="return Validate()"></td>
                </tr>
            </table>
             </center>
        </form>
    </body>
    </br></br></br></br></br></br> 
    <%@include file="footer.jsp"%>
</html>
