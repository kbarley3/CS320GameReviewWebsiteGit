package edu.ycp.cs320.lab03.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;

import GameReview.Game;
import GameReview.GameReviewController;
import GameReview.GameReviewModel;
import gamesdb.DatabaseProvider;
import gamesdb.DerbyDatabase;
import gamesdb.IDatabase;


public class GameReviewHomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameReviewController controller = new GameReviewController();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("GameReviewHomeDoGet");
		req.setAttribute("games", controller.getModel().getDb().findAllGames());
		req.getAttribute("game");
		
		String user = (String) req.getSession().getAttribute("user");
		if (user == null) {
			System.out.println("   User: <" + user + "> not logged in or session timed out");
			
			// user is not logged in, or the session expired
			resp.sendRedirect(req.getContextPath() + "/gameReviewLoginPage");
			return;
		}
		req.setAttribute("username", user);
		req.getRequestDispatcher("/_view/gameReviewHomePage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String userSession = (String) req.getSession().getAttribute("user");
		req.setAttribute("username", userSession);
		
		String enteredName = req.getParameter("search");
		if (enteredName != null && enteredName != "") {
			req.setAttribute("games", controller.getModel().getDb().findGamesByNameWithoutFullName(enteredName));
			req.getRequestDispatcher("/_view/gameReviewHomePage.jsp").forward(req, resp);
		}
		
		String selectedGenre = req.getParameter("GenreSearch");
			if (selectedGenre == null || selectedGenre.equals("All")) {
				req.setAttribute("games", controller.getModel().getDb().findAllGames());
			}
			else {
			req.setAttribute("games", controller.findGamesByGenre(selectedGenre));
			}
		
		String selectedReleaseDateSortBy = req.getParameter("ByReleaseDate");
		if (selectedReleaseDateSortBy != null && (selectedReleaseDateSortBy.equals("Oldest") || selectedReleaseDateSortBy.equals("Newest"))) {
			req.setAttribute("games", controller.getModel().getDb().findGamesByReleaseDate(selectedReleaseDateSortBy));
		}
		
		
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/gameReviewHomePage.jsp").forward(req, resp);
	}
	

	
}
