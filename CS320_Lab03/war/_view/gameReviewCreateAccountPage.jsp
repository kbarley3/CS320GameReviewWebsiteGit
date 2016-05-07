<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<script src='https://www.google.com/recaptcha/api.js'></script>
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

</style>
</head>
<body>


		


<nav>
<br>
<a style="text-decoration:none; font-size:xx-large; color: white;" >Game Reviews</a>
</nav>
<form action="${pageContext.servletContext.contextPath}/gameReviewLoginPage" method="post">

<h1><div class="g-recaptcha" data-sitekey="6LeeLRwTAAAAAC7ur9Dh3AZpD8-gtEJHIs8f6eZ5"></div>
Username: <input id="UsernameElt" type="text" size="12" name="newAccountUsername"/><br>
	Password: <input id="PasswordElt" type="password" size="12" name="newAccountPassword"/> <br>
	Email:  <input id="EmailElt" type="text" size="12" name="newAccountEmail"/> <br>
	<input type="Submit" name="submit" value="Create Account"> <br>
	<font color="red">${errorMessage}</font> 
</h1>
</form>

</body>
</html>
