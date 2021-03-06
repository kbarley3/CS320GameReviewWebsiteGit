package gamesdb;

import java.util.List;

import GameReview.Credentials;
import GameReview.Game;


public interface IDatabase {
	public List<Game> findAllGames();
	public List<Game> findGamesByGenre(String genre);
	public List<Game> findGameByName(String name);
	public List<Game> findGamesByReleaseDate(String sortBy);
	public List<Credentials> findCredentialsByUsername(String username);
	public List<Game> findGamesByNameWithoutFullName(String name);
	public Integer insertCredentialsIntoCredentialTable(String username, String password);
	public List<Credentials> findAllCredentials();
	public Integer deleteCredentialsIntoCredentialTable(String username, String password);
}
