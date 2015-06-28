<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
	session.invalidate();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>signout</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<link type="text/css" rel="stylesheet" href="css/bootstrap.css"/>
<script src="js/bootstrap.js"></script>

  </head>
  
  <body>
    <div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
	<div class="container">
	<a href="#" class="brand"><h2>S3PSA DEMO</h2></a><br/>
	
	<br/><br/><br/>
</div></div></div>

<div class="container" style="position:absolute;left:300px;top:140px">

<p class="lead"><font size="8" color="009966"><i>You have been successfully logged out.....</i></font></p>

<br/><p class="lead"><font color="003399"><b>for login again or registering  new account click on corresponding button given below....</b></font></p>

</div>

<div class="container" style="position:absolute;left:300px;top:300px">


<a href="register.jsp" style="position:absolute;left:100px"><button class="btn-large btn-success">traditional login</button></a>
<a href="register.jsp" style="position:absolute;left:300px"><button class="btn-large btn-info">register</button></a>
<a href="slogin.jsp" style="position:absolute;left:440px"><button class="btn-large btn-success">S3PSA login</button></a>

</div>

<div class="navbar navbar-fixed-bottom">
			<div class="navbar-inner">
			<div class="container">
				<ul align="center" class="nav nav-pills">
					<li><a href="#">Home</a></li>
					<li><a href="#">About us</a></li>
					<li><a href="#">Policy</a></li>
					<li><a href="#">Terms and Conditions</a></li>
					<li><a href="#">Contact us</a></li>
				</ul>
				<p class="lead pull-right">copyright &copy; <a href="#">samrat</a></p>
				</div>
			</div>
        </div>
  </body>
</html>
