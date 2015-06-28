<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>




<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="bean.Stopwatch"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>S3PAS password screen </title>
    
	


	<!-- JavaScript code to check Password constraints-->
 <script language="JavaScript" type="text/javascript">
function formcheck(pass)
{

if (pass.password.value == "")
  {
    alert("Please enter a value for the user password field.");
    pass.password.focus();
    return (false);
  }
  
  if (pass.password.value.length < 4||pass.password.value.length >4)
  {
    alert("We have all our passwords of length 4");
    pass.password.focus();
    return (false);
  }
 
 return (true);
 }
 </script>
 
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
  
    <%
  
System.out.println("created String array now trying to retrieve passwords");   
  
  
  //getting username
  String user=request.getParameter("uname");
  
  
  
  System.out.println("Got user-name : "+user);
 %> 
  
  
  <jsp:useBean id="ret" class="bean.RetrivPassBean"/>
<jsp:setProperty property="*" name="ret"/>
  

  
  <%

  // getting password through this user name 
String pass= ret.RetrivP();

if(pass==null)
{
response.sendRedirect("error.jsp");
}
else

System.out.println("Password retrived= "+pass);
  
  
  
  // breaking password into characters
	System.out.println("now breaking into tokens");
  	char[] token=ret.tokenize(pass);
  	System.out.println("We are done with tokenizing ");
  
  
  
  //generating an ArrayList that will hold password space
  System.out.println("Generating ArrayList : ");
  
  
  ArrayList a= bean.ShufflinList.ArrayListGenerator();
  System.out.println("Size of ArrayList :"+a.size());
 
 
 
  // checking if shuffled list satisfies basic necessities as forming a triangle
  // and having such co-ordinate that always have something in between them.
		
 Boolean flag= bean.CoordinateChecker.checkCoordinate(a,token);
 System.out.println("Value of flag is inside pass.jsp is :"+flag);
 
 
 while(!flag)
 {
 
  System.out.println("Shuffling the Array List");
  bean.ShufflinList.shuffler(a);
 
 	 //shuffling the list
  flag= bean.CoordinateChecker.checkCoordinate(a,token);
  System.out.println("Value of flag is :"+flag);
 
 }

  		session.setAttribute("arrlst",a);
  		session.setAttribute("Actualpass",token);
  		session.setAttribute("uemail",user);
  		System.out.println("attribute set kardiye");  


// color ka sara funda yha pe kar rakha hai mene
// capital alphabets 65-90
// small alphabets 97-122



  String[] color= new String[81];
for(int i=0;i<81;i++)
{
String k=(String)a.get(i);
char l=k.charAt(0);
if(l>=65&&l<=90)
color[i]="#66FF66";
else if(l>=97&&l<=122)
color[i]="#6699FF";
else if(l>=48&&l<=57)
color[i]="#C0C0C0";
else
color[i]="#FF66FF";
}


  
  
	%>

		<form class="form-inline" action="check.jsp" method="post" onsubmit="return formcheck(this)" name="pass" language="JavaScript" style="position:absolute;left:150px;top:150px;">
		<table class="well span8"  border="2" cellspacing="6" cellpadding="6" id="tblLetters" style="padding:0.3cm 0.3cm 0.3cm 0.3cm;">
  
		<%  
		
		
		
		
		
  		for(int i=0;i<81;)
  			{
  			%>
  			
  			
  			<tr>
    		<td  data-lett="<%=a.get(i) %>" width="40" height="30" bgcolor="<%=color[i] %>" ><b><font size="5"><%=a.get(i++) %></font></b></td>
    		<td  data-lett="<%=a.get(i) %>" width="40" height="30" bgcolor="<%=color[i] %>"><b><font size="5" ><%=a.get(i++) %></font></b></td>
    		<td  data-lett="<%=a.get(i) %>" width="40" height="30" bgcolor="<%=color[i] %>"><b><font size="5" ><%=a.get(i++) %></font></b></td>
    		<td  data-lett="<%=a.get(i) %>" width="40" height="30" bgcolor="<%=color[i] %>"><b><font size="5" ><%=a.get(i++) %></font></b></td>
    		<td  data-lett="<%=a.get(i) %>" width="40" height="30" bgcolor="<%=color[i] %>"><b><font size="5" ><%=a.get(i++) %></font></b></td>
    		<td  data-lett="<%=a.get(i) %>" width="40" height="30" bgcolor="<%=color[i] %>"><b><font size="5" ><%=a.get(i++) %></font></b></td>
  			<td  data-lett="<%=a.get(i) %>" width="40" height="50" bgcolor="<%=color[i] %>"><b><font size="5" ><%=a.get(i++) %></font></b></td>
  			<td  data-lett="<%=a.get(i) %>" width="40" height="30" bgcolor="<%=color[i] %>"><b><font size="5" ><%=a.get(i++) %></font></b></td>
  			<td  data-lett="<%=a.get(i) %>" width="40" height="30" bgcolor="<%=color[i] %>"><b><font size="5" ><%=a.get(i++) %></font></b></td>
  			
  			</tr>
  			
  
  
			  <%
  			}
  			
  
  		
 
  		System.out.println("We created the table...");
  		long s=Stopwatch.start();
  		 
  		 
  		  %>  
  
  
  
 </table>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 
 <input class="span3 lead" style="padding:0.4cm 0.4cm 0.4cm 0.4cm;" id='results' type='text' name="password" />
 <input type="submit"  class="btn btn-success" value="Authenticate"/>
 </form>
   
    
  
  
  

<!--  Below lies the headache Don't even try to look below  -->  
  
    // Action on mouse click function
 <script type="text/javascript">
var addEvent = function (elem, eventType, func) {
    if ( elem.addEventListener )
        addEvent = function (elem, eventType, func) {
            elem.addEventListener(eventType, func, false);
        };
    else if ( elem.attachEvent )
        addEvent = function (elem, eventType, func) {
            elem.attachEvent('on' + eventType, func);
        };
    addEvent(elem, eventType, func);
};

var delegateEvent = function (elem, childElems, eventType, func) {
    addEvent(elem, eventType, function (e) {
        var evt = e || window.event;
        var elem = evt.target || evt.srcElement;
        if ( elem.nodeName.toLowerCase() == childElems ) {
            func(elem);
        }
    });
};
function updateResults(cell) {
    document.getElementById('results').value += cell.getAttribute('data-lett');
}
delegateEvent(document.getElementById('tblLetters'), 'td', 'click', updateResults);

</script>
<!-- end of the function -->
  
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
