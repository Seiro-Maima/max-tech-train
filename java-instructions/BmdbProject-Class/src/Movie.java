
public class Movie {

	// instance variables
	String title;
	String year;
	String rating;
	String genre;
	
	// default constructor
	public Movie () {
		super();
	}
	
	// fully loaded constructor
	public Movie(String title, String year, String rating, String genre) {
		super();
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.genre = genre;
	}

	// getters and setters
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}

	// display movie summary
	public String movieSummary() {
		
		String str;
		str = title + " (" + rating + ") was released in " + year + ". Genre(s): " + genre;

		return str;
	}
	
}
