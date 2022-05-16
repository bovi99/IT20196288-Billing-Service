<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ajax Login with jquery mysql and bootstrap</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
 $("#rolling").slideDown('slow');
});
$(document).ready(function(){
  $("#submit").click(function(){
     if($("#uname").val()=="" || $("#pass").val()=="") {
   $(".display").fadeTo('slow','0.99');
   $("msg").hide();
   $(".display").fadeIn('slow',function(){$(".display").html("<span id='error'>Please enter username and password</span>");});
   return false;
     }else{
    $(".display").html('<span class="normal"><img src="img/loader.gif"></span>');
    var uname = $("#uname").val();
    var pass = $("#pass").val();
     $.getJSON("server.php",{username:uname,password:pass},function(json)
     {
      // Parse JSON data if json.response.error = 1 then login successfull
      if(json.response.error == "1")
      {
       $(".display").css('background','#CBF8AF');
       $(".display").css('border-bottom','4px solid #109601');
       data = "<span id='msg'>Welcome "+uname+"</span>";
       window.location.href = "theme_profile.html";
       /*
     login successfull, write code to Show next page here 
       */
      }
      // Login failed
      else
      {
       $(".display").css('background','#FFD9D9');
       $(".display").css('border-bottom','4px solid #FC2607');
       data = "<span id='error'>Error check username and password?</span>";
      }
       $(".display").fadeTo('slow','0.99');
       $(".display").fadeIn('slow',function(){$(".display").html("<span id='msg'>"+data+"</span>");});
     });
    return false;
   }
  });
   $("#uname").focus(function(){
    $(".display").fadeTo('slow','0.0',function(){$(".display").html('');});
   });
   $("#pass").focus(function(){
    $(".display").fadeTo('slow','0.0',function(){$(".display").html('');});
   });
});
</script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<!--Fontawesome CDN-->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
</head>
<body>
<div class="container">
 <div class="d-flex justify-content-center h-100">
  <div class="card" id="rolling">
   <div class="card-header">
    <h3>Sign In</h3><span id="msg"></span>
    <div class="d-flex justify-content-end social_icon">
     <span><i class="fab fa-facebook-square"></i></span>
     <span><i class="fab fa-google-plus-square"></i></span>
     <span><i class="fab fa-twitter-square"></i></span>
    </div><p class="display"></p> <span id="msg"></span>
   </div>
   <div class="card-body">
   <form name="test" id="test" method="POST">
     <div class="input-group form-group">
      <div class="input-group-prepend">
       <span class="input-group-text"><i class="fas fa-user"></i></span>
      </div>
      <input type="text" name="uname" id="uname" class="form-control" placeholder="username">
     </div>
     <div class="input-group form-group">
      <div class="input-group-prepend">
       <span class="input-group-text"><i class="fas fa-key"></i></span>
      </div>
      <input type="password" name="pass" id="pass" class="form-control" placeholder="password">
     </div>
     <div class="row align-items-center remember">
      <input type="checkbox">Remember Me
     </div>
     <div class="form-group">
      <a href="home.jsp" class="btn btn-lg btn-warning px-3 d-none d-lg-block"> Login</a>
     </div>
    </form> 
    </div>
     <div class="card-footer">
    <div class="d-flex justify-content-center links">
     Don't have an account?<a href="#">Sign Up</a>
    </div>
    <div class="d-flex justify-content-center">
     <a href="#">Forgot your password?</a>
    </div>
   </div> 
   </div>
  </div>
 </div>
</div>
<style>
@import url('https://fonts.googleapis.com/css?family=Numans');
 
html,body{
background-image: url('http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg');
background-size: cover;
background-repeat: no-repeat;
height: 100%;
font-family: 'Numans', sans-serif;
}
.container{
height: 100%;
align-content: center;
}
.card{
height: 370px;
margin-top: auto;
margin-bottom: auto;
width: 400px;
background-color: rgba(0,0,0,0.5) !important;
}
.social_icon span{
font-size: 60px;
margin-left: 10px;
color: #FFC312;
}
.social_icon span:hover{
color: white;
cursor: pointer;
}
.card-header h3{
color: white;
}
.social_icon{
position: absolute;
right: 20px;
top: -45px;
}
.input-group-prepend span{
width: 50px;
background-color: #FFC312;
color: black;
border:0 !important;
}
input:focus{
outline: 0 0 0 0  !important;
box-shadow: 0 0 0 0 !important;
}
.remember{
color: white;
}
.display {color:#fff;}
.remember input
{
width: 20px;
height: 20px;
margin-left: 15px;
margin-right: 5px;
}
.login_btn{
color: black;
background-color: #FFC312;
width: 100px;
}
.login_btn:hover{
color: black;
background-color: white;
}
.links{
color: white;
}
.links a{
margin-left: 4px;
}
</style>
</body>
</html>
