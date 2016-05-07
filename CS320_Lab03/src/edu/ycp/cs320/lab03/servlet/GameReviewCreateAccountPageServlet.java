package edu.ycp.cs320.lab03.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class GameReviewCreateAccountPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/gameReviewCreateAccountPage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		String enteredUsername = req.getParameter("username");
		String enteredPassword = req.getParameter("password");
		String enteredEmail = req.getParameter("email");
		
		System.out.println(enteredUsername);
		
		if (enteredUsername != null || enteredPassword != null || enteredUsername != "" || enteredPassword != "" || enteredEmail != null || enteredEmail != "") {
			req.setAttribute("newAccountUsername", enteredUsername);
			req.setAttribute("newAccountPassword", enteredPassword);
			req.setAttribute("newAccountEmail", enteredEmail);
			
			
			req.getRequestDispatcher("/_view/gameReviewLoginPage.jsp").forward(req, resp);
		}
		
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/gameReviewCreateAccountPage.jsp").forward(req, resp);
	}

	
}
