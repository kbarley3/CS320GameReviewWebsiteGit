package GameReview;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Game implements Comparable<Game> {
	private int gameId;
	private String name;
	private String genre;
	private String description;
	private String releasedate;
	private String coverPictureUrl;
	private String embedLinkUrl;
	
	public Game() {
		
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getCoverPictureUrl() {
		return coverPictureUrl;
	}

	public void setCoverPictureUrl(String coverPictureUrl) {
		this.coverPictureUrl = coverPictureUrl;
	}

	public String getEmbedLinkUrl() {
		return embedLinkUrl;
	}

	public void setEmbedLinkUrl(String embedLinkUrl) {
		this.embedLinkUrl = embedLinkUrl;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	@Override
	public int compareTo(Game game) {
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy"); 
		
		int compareValue = 0;
		try {
			compareValue = df.parse(this.getReleasedate()).compareTo(df.parse(game.getReleasedate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return compareValue;
	}
	
	
}