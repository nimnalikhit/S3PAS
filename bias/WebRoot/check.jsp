
<%@page import="dao.RetrivPassDao"%><jsp:useBean id="user" class="bean.RetrivPassBean"/>
<jsp:setProperty property="*" name="user"/>

<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>S3PAS rocks !!</title>
    
	
  </head>
  
  <body>
  <%
    System.out.println("We are now inside check.jsp   HURRAY!!");
  String pass= request.getParameter("password");
    System.out.println("wE GOT THE session PASSWORD= "+pass);
    
    
  ArrayList a=(ArrayList)session.getAttribute("arrlst");
    System.out.println("We got the arraylist from last page=  "+a);
  
  char[] Apass=(char[])session.getAttribute("Actualpass");
    System.out.println("We got the actual password= "+Apass[0]+""+Apass[1]+""+Apass[2]+""+Apass[3]);

	
  
  boolean flag=bean.CheckPoint.chk(a,pass,Apass);
    System.out.println("We are back to check.jsp, value of flag is :"+flag);
  
  if(flag==true)
  {
  
  		String id=RetrivPassDao.id;
  		System.out.println("id in check is"+id);
		session.setAttribute("id",id);
  
  response.sendRedirect("home.jsp");
  }
  else
  {
response.sendRedirect("error.jsp");
  } %>
  
  </body>
</html>
