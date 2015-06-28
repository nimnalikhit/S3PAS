<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="bean.Stopwatch"%>
<%@page import="dao.LoginTime"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

<link type="text/css" rel="stylesheet" href="css/bootstrap.css"/>
<script src="js/bootstrap.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>

  </head>
  
  <body>
    <div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
	<div class="container">
	<a href="#" class="brand"><h2>S3PSA DEMO</h2></a><br/>
	
	<br/><br/><br/>
</div></div></div>

<div class="container" style="position:absolute;left:180px;top:150px">

<h1><font color="green">Hurray....  </font></h1>

<%
		
    	String user=(String)session.getAttribute("uemail");
    	double el=Stopwatch.elapsedTime();
    	System.out.println("Time elapsed in logging and calculating is : "+el+" seconds");
    	String id=(String)session.getAttribute("id");
    	System.out.println("id is"+id);
    	LoginTime.insert(id,el);
    	System.out.println("Time inserted in database");
%>

<font color="#009999" size="+2"> Welcome</font><font color="#990000" size="+2" face="MS Serif, New York, serif">&nbsp;&nbsp;&nbsp;&nbsp;<%=user%></font>

<p class="lead center"><font size="6" color="003399"><i><br/>u have been successfully logged in with this more secured technique... </i></font></p>

<br/><p class="lead"><font size="5" color="CC3399"><b>for quiting the session kindly sign out, the button is given below...</b></font></p><br/>

</div>

<div class="container" style="position:absolute;left:300px;top:400px">


<a href="signout.jsp" style="position:absolute;left:300px"><button class="btn-large btn-inverse">sign out</button></a>


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
