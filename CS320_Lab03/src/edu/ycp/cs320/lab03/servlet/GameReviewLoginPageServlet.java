package edu.ycp.cs320.lab03.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GameReview.GameReviewController;



public class GameReviewLoginPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameReviewController dbcontroller = new GameReviewController();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		req.getRequestDispatcher("/_view/gameReviewLoginPage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		boolean validLogin = false;
		String errorMessage = null;
		
		
		
		String enteredUsername = req.getParameter("username");
		String enteredPassword = req.getParameter("password");
		if (enteredUsername == null || enteredPassword == null || enteredUsername == "" || enteredPassword == "") {
			errorMessage = "Please enter a username and password!";
		}
		
		
		String newAccountUsername = req.getParameter("newAccountUsername");
		String newAccountPassword = req.getParameter("newAccountPassword");
		String newAccountEmail = req.getParameter("newAccountEmail");
		
	
		
		if (newAccountUsername != null && newAccountPassword != null && newAccountUsername != "" && newAccountPassword != "" && newAccountEmail != null && newAccountEmail != "") {
			if (dbcontroller.doesUsernameAlreadyExist(newAccountUsername) == false) {
				dbcontroller.insertCredentialsIntoCredentialsTable(newAccountUsername, newAccountPassword);
			}
		}

		if (enteredUsername != null && enteredPassword != null && enteredUsername != "" && enteredPassword != "") {
			validLogin = dbcontroller.validateCredentials(enteredPassword, enteredUsername);
		}
		
		if (validLogin) {
			// store user object in session
			req.getSession().setAttribute("user", enteredUsername);
			//redirect to homepage
			resp.sendRedirect(req.getContextPath() + "/gameReviewHomePage");
		}
		if (errorMessage != "Please enter a username and password!"){
		errorMessage = "Username and/or password invalid";
		}
		req.setAttribute("errorMessage", errorMessage);
		
		
		
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/gameReviewLoginPage.jsp").forward(req, resp);
	}

	
}
