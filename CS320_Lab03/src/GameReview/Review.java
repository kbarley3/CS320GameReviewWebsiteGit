package GameReview;

public class Review {
	private Account user;
	private String comment;
	
	public Review(Account user, String comment) {
		this.user = user;
		this.comment = comment;
	}
	
	public Account getUser() {
		return user;
	}

	public void setUser(Account user) {
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
