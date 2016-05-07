package GameReviewClassTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import gamesdb.DatabaseProvider;
import gamesdb.FakeDatabase;
import gamesdb.IDatabase;

public class FakeDBTest {
	private IDatabase db = null;
	
	@Before
	public void setUp() throws Exception {
		// creating DB instance here
		DatabaseProvider.setInstance(new FakeDatabase());
		db = DatabaseProvider.getInstance();		
		
	}

	
	
	@Test
	public void testFindAllGames() {
		System.out.println(db.findAllGames().get(0).getName());
	}

}
