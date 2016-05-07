package gamesdb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import GameReview.Credentials;
import GameReview.Game;


public class InitialData {

	// reads initial Game data from CSV file and returns a List of Games
	public static List<Game> getGames() throws IOException {
		List<Game> gameList = new ArrayList<Game>();
		ReadCSV readGames = new ReadCSV("games.csv");
		try {
			// auto-generated primary key for games table
			Integer gameId = 1;
			while (true) {
				List<String> tuple = readGames.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Game game = new Game();
				game.setGameId(gameId++);				
				game.setName(i.next());
				game.setCoverPictureUrl(i.next());
				game.setEmbedLinkUrl(i.next());
				game.setDescription(i.next());
				game.setReleasedate(i.next());
				game.setGenre(i.next());
				gameList.add(game);
			}
			return gameList;
		} finally {
			readGames.close();
		}
	}
	
	// reads initial Credentials data from CSV file and returns a List of Credentials
	public static List<Credentials> getCredentials() throws IOException {
		List<Credentials> credentialsList = new ArrayList<Credentials>();
		ReadCSV readCredentials = new ReadCSV("Credentials.csv");
		try {
			// auto-generated primary key for authors table
			Integer credentialId = 1;
			while (true) {
				List<String> tuple = readCredentials.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Credentials credential = new Credentials();
				credential.setCredentialId(credentialId++);				
				credential.setUsername(i.next());
				credential.setPassword(i.next());
				credentialsList.add(credential);
			}
			return credentialsList;
		} finally {
			readCredentials.close();
		}
	}
	
}
