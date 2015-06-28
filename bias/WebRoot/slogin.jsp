<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>S3PAS HomeScreen : </title>


<!-- Function to check UserName constraints  -->
<script language="JavaScript" type="text/javascript">
function formcheck(intern)
{

if (intern.uname.value == "")
  {
    alert("Please enter a value for the user name field.");
  	intern.uname.focus();
  	return (false);
  }
   if (intern.uname.value.length <4)
  {
    alert("Do you really think that you can make a fool out of us");
    intern.uname.focus();
    return (false);
  }

  return(true);
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






<form class="well span5" action="pass.jsp" method="post" onsubmit="return formcheck(this)" name="intern" style="position:absolute;left:400px;top:140px">
<label class="lead"><i><font color="#4682B4">Enter your valid User Name</font></i></label><br/>
<input name="uname" type="text" placeholder="type valid username here"/>
<br />
<br />
<input name="submit" type="submit" value="Check" class="btn btn-primary" />

</form>

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