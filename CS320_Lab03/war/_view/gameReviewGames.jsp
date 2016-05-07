<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
  <meta charset="utf-8" />
  <title>Game Reviews</title>
  <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
  
  <style type="text/css">
  nav {
    line-height: 20px;
    background-color:#0066ff;
    height:60px;
    width:100%;
    <!--float:left;-->
    padding-left:5px; 
	padding-right:5px;
	padding-top: 5px;
	padding-bottom: 5px;
	text-align: right
	<!--color: gray;-->
}

  body{
  	background-color:lightgrey;
  }
  </style>
  
</head>
<body>
  <div id="wrapper">
    <header>
    </header>
    <nav>
	
		<br>
		<a style="text-decoration:none; text-align:left; font-size:xx-large; color: white;" href="${pageContext.servletContext.contextPath}/gameReviewHomePage">Game Reviews</a>
		
		<a style="float:right; text-align:left; font-size:x-large; color: white;" >${username}</a>
		
		<form action="${pageContext.servletContext.contextPath}/gameReviewLoginPage" method="get">
			<input style="float:right;" type="Submit" name="submit" value="Logout">
		</form>
		
		<button style="float:right; margin-right: 5px" type="button">&#128269</button>
		<input style="float:right" type="text" name="search" id="search" tabindex="1" autocomplete="on" class="formtext">	
		<select style="float:right" >
		  <option selected disabled>Select Genre</option>
		  <option value="All">All</option>
		  <option value="Action">Action</option>
		  <option value="Adventure">Adventure</option>
		  <option value="Role-playing">Role-playing</option>
		  <option value="Simulation">Simulation</option>
		  <option value="Strategy">Strategy</option>
		  <option value="Sports">Sports</option>
		</select>
		
<!-- 		<a href="actiongames.html" target="_parent"><button style="margin-left:20px; background-color: #555555; color: white; padding: 15px 20px; border: none;" >Action Games</button></a>
		<a href="adventuregames.html" target="_parent"><button style="background-color: #555555; color: white; padding: 15px 20px; border: none;" >Adventure Games</button></a>
		<a href="role-playinggames.html" target="_parent"><button style="background-color: #555555; color: white; padding: 15px 20px; border: none;" >Role-playing Games</button></a>
		<a href="simulationgames.html" target="_parent"><button style="background-color: #555555; color: white; padding: 15px 20px; border: none;" >Simulation Games</button></a>
		<a href="strategygames.html" target="_parent"><button style="background-color: #555555; color: white; padding: 15px 20px; border: none;" >Strategy Games</button></a>
		<a href="sportsgames.html" target="_parent"><button style="background-color: #555555; color: white; padding: 15px 20px; border: none;" >Sports Games</button></a>
		 -->
		
		
		

		
		
		
		
    </nav>
    <section id="content">
      <article>
      
      
		<center>
		<br>
		<br>
		<a style="text-decoration:none; font-size:x-large; color: black;" href="games.html">${game.name}</a>
		<br>
		<iframe width="560" height="315" src=${game.embedLinkUrl} frameborder="0" allowfullscreen></iframe>
		</center>
		
		<br>
		

				
		
		<br>
		Description:
		<br>
		<center>
		${game.description}
		</center>
		
		<br>
		<br>
		Release Date:
		<br>
		<center>
		${game.releasedate}
		</center>
		
		
		<br>
		<br>
		Genre:
		<br>
		<center>
		<c:forEach items="${game.genre}" var="currentGenre">
			${currentGenre}
		</c:forEach>
		</center>
		
		
		<br>
		<br>
		Reviews:
		<br>
		<center>
		Star Rating and Description
		<br>
		<br>
		
		</center>
      </article>
    </section>
    <aside>
    </aside>
    <footer>
    </footer>
  </div>   
</body>
</html>