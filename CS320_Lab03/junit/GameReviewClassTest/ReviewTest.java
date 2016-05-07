package GameReviewClassTest;

import static org.junit.Assert.*;

import org.junit.Test;

import GameReview.Account;
import GameReview.Review;

public class ReviewTest {

	private Account user1 = new Account("Admin", "admin", "Admin@email.com");
	private Review review1 = new Review(user1, "This game was great!");
	
	@Test
	public void reviewGetUsernameTest() {
		assertTrue(review1.getUser().getUsername() == "Admin");
	}
	
	@Test
	public void reviewGetCommentTest() {
		assertTrue(review1.getComment() == "This game was great!");
	}
	
	@Test
	public void reviewSetUsernameTest() {
		review1.getUser().setUsername("Bob");
		assertTrue(review1.getUser().getUsername() == "Bob");
	}
	
	@Test
	public void reviewSetCommentTest() {
		review1.setComment("This game was horrible!");
		assertTrue(review1.getComment() == "This game was horrible!");
	}

}
