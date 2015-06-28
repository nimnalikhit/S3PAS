<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Register yourself</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<link type="text/css" rel="stylesheet" href="css/bootstrap.css"/>

<script src="js/bootstrap.js"></script>
	

  </head>
  
  <body>
  
<script>
function validate()
{
var y=document.forms["reg"]["pass"].value;
var y1=document.forms["reg"]["pass1"].value;

if((y==null)||(y1!=y))
	{
		alert("Password not match");
		return false;
	}
	
}



</script>
  
    <div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
	<div class="container">
	<a href="#" class="brand"><h2>S3PSA DEMO</h2></a><br/>
	</div></div></div>

<div class="container span3" style="position:absolute;left:300px;top:140px">
<form name="reg" class="well span3" method="get" action="register1.jsp" onSubmit="return validate();">
<h2 class="lead well">sign up for a new account</h2>
<label>User Name</label>
<input type="text" name="user" class="span3" placeholder="type username here" style="padding:0.4cm 0.4cm 0.4cm 0.4cm;" >
<label>Password</label>
<input type="password" id="str" name="pass" class="span3" placeholder="type password here" style="padding:0.4cm 0.4cm 0.4cm 0.4cm;">
<label>Confirm Password</label>
<input type="password" id="str" name="pass1" class="span3" placeholder="retype password here" style="padding:0.4cm 0.4cm 0.4cm 0.4cm;">
<input type="submit" name="submit" id="go" value="sign up" class="btn btn-primary">&nbsp;
<input type="reset" name="clear" value="clear" class="btn">
</form>
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
				<p class="lead pull-right">copyright &copy;<a href="#">samrat</a></p>
				</div>
			</div>
        </div>
  </body>
</html>
