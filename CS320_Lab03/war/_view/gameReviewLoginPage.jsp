<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<style>



  nav {
    line-height: 20px;
    background-color:#0066ff;
    height:60px;
    width:100%;
    
}

body {
    background-image: url("https://pixabay.com/static/uploads/photo/2014/05/26/12/05/minecraft-354460_960_720.png");
    background-size: 100% 1000%;
    background-repeat: no-repeat;
}

h1 {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  font-size: 80%;
  text-align: right;
  color: white;
}
h2 {
  position: absolute;
  top: 53.1%;
  left: 47.5%;
  transform: translate(-50%, -50%);
  font-size: 80%;
  text-align: right;
  color: white;
}
h3 {
  position: absolute;
  top: 60%;
  left: 50%;
  transform: translate(-50%, -50%);
  font-size: 80%;
  text-align: right;
  color: white;
}

</style>
</head>
<body>


		


<nav>
<br>
<a style="text-decoration:none; font-size:xx-large; color: white;" >Game Reviews</a>
</nav>

<form action="${pageContext.servletContext.contextPath}/gameReviewLoginPage" method="post">
<h1>Login: <input id="UsernameElt" type="text" size="12" name="username"/><br>
	Password: <input id="PasswordElt" type="password" size="12" name="password"/> <br>
	<input type="Submit" name="submit" value="Login"> <br>
</h1>
</form>
		<form action="${pageContext.servletContext.contextPath}/gameReviewCreateAccountPage" method="get">
		<h2>
			<input type="Submit" name="creataccount" value="Create Account">
			</h2>
		</form>	
<h3>
<font color="red">${errorMessage}</font> 
</h3>
</body>
</html>
