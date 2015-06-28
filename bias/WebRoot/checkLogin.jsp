<jsp:useBean id="login" class="bean.LoginBean"/>
<jsp:setProperty property="*" name="login"/>

<%
	if(login.checkUser())
	{
		
		String uemail=login.getEmail();
		session.setAttribute("uemail",uemail);
		response.sendRedirect("home.jsp");
	}
	else
	{
		response.sendRedirect("error.jsp");
	}
%>