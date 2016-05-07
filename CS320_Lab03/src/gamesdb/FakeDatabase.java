package gamesdb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import GameReview.Credentials;
import GameReview.Game;



public class FakeDatabase implements IDatabase {
	
	private List<Game> gameList;
	
	// Fake database constructor - initializes the DB
	// the DB only consists for a List of Authors and a List of Books
	public FakeDatabase() {
		gameList = new ArrayList<Game>();
		
		
		// Add initial data
		readInitialData();
		
//		System.out.println(gameList.size() + " authors");
//		System.out.println(bookList.size() + " books");
	}

	// loads the initial data retrieved from the CSV files into the DB
	public void readInitialData() {
		try {
			gameList.addAll(InitialData.getGames());
		} catch (IOException e) {
			throw new IllegalStateException("Couldn't read initial data", e);
		}
	}
	
	// query that retrieves Book and its Author by Title
	//@Override
/*	public List<Game> findAuthorAndBookByTitle(String title) {
		List<Game> result = new ArrayList<Game>();
		for (Game game : gameList) {
//			System.out.println("Book: <" + book.getTitle() + ">" + "  Title: <" + title + ">");
			
			if (game.getName().equals(title)) {
				Game gameName = findAuthorByAuthorId(book.getAuthorId());
				result.add(new Pair<Author, Book>(author, book));
			}
		}
		return result;
	}
	
	// query that retrieves all Books, for the Author's last name
	@Override
	public List<Pair<Author, Book>> findAuthorAndBookByAuthorLastName(String lastName)
	{
		// create list of <Author, Book> for returning result of query
		List<Pair<Author, Book>> result = new ArrayList<Pair<Author, Book>>();
		
		// search through table of Books
		for (Book book : bookList) {
			for (Author author : gameList) {
				if (book.getAuthorId() == author.getAuthorId()) {
					if (author.getLastname().equals(lastName)) {
						// if this book is by the specified author, add it to the result list
						result.add(new Pair<Author, Book>(author, book));						
					}
				}
			}
		}
		return result;
	}*/

	
/*	// query that retrieves all Books, with their Authors, from DB
	@Override
	public List<Pair<Author, Book>> findAllBooksWithAuthors() {
		List<Pair<Author, Book>> result = new ArrayList<Pair<Author,Book>>();
		for (Book book : bookList) {
			Author author = findAuthorByAuthorId(book.getAuthorId());
			result.add(new Pair<Author, Book>(author, book));
		}
		return result;
	}*/
		

	// query that retrieves all Authors from DB
	@Override
	public List<Game> findAllGames() {
		List<Game> result = new ArrayList<Game>();
		for (Game game : gameList) {
			result.add(game);
		}
		return result;
	}
	
	public List<Game> findGamesByGenre(String genre) {
		List<Game> result = new ArrayList<Game>();
		for (Game game : gameList) {
			if (game.getGenre() == genre) {
				result.add(game);
			}
		}
		return result;
	}

	@Override
	public List<Game> findGameByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Game> findGamesByReleaseDate(String sortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Credentials> findCredentialsByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> findGamesByNameWithoutFullName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertCredentialsIntoCredentialTable(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Credentials> findAllCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteCredentialsIntoCredentialTable(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// query that inserts a new Book, and possibly new Author, into Books and Authors lists
	// insertion requires that we maintain Book and Author id's
	// this can be a real PITA, if we intend to use the IDs to directly access the ArrayLists, since
	// deleting a Book/Author in the list would mean updating the ID's, since other list entries are likely to move to fill the space.
	// or we could mark Book/Author entries as deleted, and leave them open for reuse, but we could not delete an Author
	//    unless they have no Books in the Books table
/*	@Override
	public Integer insertBookIntoBooksTable(String title, String isbn, String lastName, String firstName)
	{
		int authorId = -1;
		int bookId   = -1;
		
		// search Authors list for the Author, by first and last name, get author_id
		for (Author author : gameList) {
			if (author.getLastname().equals(lastName) && author.getFirstname().equals(firstName)) {
				authorId = author.getAuthorId();
			}
		}
		
		// if the Author wasn't found in Authors list, we have to add new Author to Authors list
		if (authorId < 0) {
			// set author_id to size of Authors list + 1 (before adding Author)
			authorId = gameList.size() + 1;
			
			// add new Author to Authors list
			Author newAuthor = new Author();			
			newAuthor.setAuthorId(authorId);
			newAuthor.setLastname(lastName);
			newAuthor.setFirstname(firstName);
			gameList.add(newAuthor);
			
			System.out.println("New author (ID: " + authorId + ") " + "added to Authors table: <" + lastName + ", " + firstName + ">");
		}

		// set book_id to size of Books list + 1 (before adding Book)
		bookId = bookList.size() + 1;

		// add new Book to Books list
		Book newBook = new Book();
		newBook.setBookId(bookId);
		newBook.setAuthorId(authorId);
		newBook.setTitle(title);
		newBook.setIsbn(isbn);
		bookList.add(newBook);
		
		// return new Book Id
		return bookId;
	}
	

	// query that retrieves an Author based on author_id
	private Author findAuthorByAuthorId(int authorId) {
		for (Author author : gameList) {
			if (author.getAuthorId() == authorId) {
				return author;
			}
		}
		return null;
	}*/
}
