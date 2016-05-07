package GameReview;

import gamesdb.DatabaseProvider;
import gamesdb.DerbyDatabase;
import gamesdb.IDatabase;

public class GameReviewModel {
	private IDatabase db = null;
	
	
	public GameReviewModel() {
	
		//initializes database
		DatabaseProvider.setInstance(new DerbyDatabase());
		setDb(DatabaseProvider.getInstance());		
		
	}


	public IDatabase getDb() {
		return db;
	}


	public void setDb(IDatabase db) {
		this.db = db;
	}
}
