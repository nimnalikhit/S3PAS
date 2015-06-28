<jsp:useBean id="reg" class="bean.RegisterBean" />
<jsp:setProperty property="*" name="reg"/>
<%
	reg.insert();
	response.sendRedirect("index.jsp");
%>