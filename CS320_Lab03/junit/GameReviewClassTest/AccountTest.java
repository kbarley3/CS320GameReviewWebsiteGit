package GameReviewClassTest;

import static org.junit.Assert.*;

import org.junit.Test;

import GameReview.Account;

public class AccountTest {
	private Account user1 = new Account("Admin", "admin", "Admin@email.com");
	

	@Test
	public void usernameGetTest() {
		assertTrue(user1.getUsername() == "Admin");
	}
	
	@Test
	public void passwordGetTest() {
		assertTrue(user1.getPassword() == "admin");
	}
	
	@Test
	public void emailGetTest() {
		assertTrue(user1.getEmail() == "Admin@email.com");
	}
	
	@Test
	public void usernameSetTest() {
		user1.setUsername("Bob");
		assertTrue(user1.getUsername() == "Bob");
	}
	
	@Test
	public void passwordSetTest() {
		user1.setPassword("password");
		assertTrue(user1.getPassword() == "password");
	}
	
	@Test
	public void emailSetTest() {
		user1.setEmail("Bob@email.com");
		assertTrue(user1.getEmail() == "Bob@email.com");
	}
	
	

}
