package bmdb_console;

public class Movie {

	private int id;
	private String title;
	private int year;
	private String rating;
	private String director;
		
	public Movie() {
		id = 0;
		title = "";
		year = 0000;
		rating = "";
		director = "";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String toString() {
		String message = "Movie " + id + "\n"
						+ "\tTitle: \t\t" + title + "\n"
						+ "\tYear: \t\t" + year + "\n"
						+ "\tRating: \t" + rating + "\n"
						+ "\tDirector: \t" + director + "\n";
		return message;
	}
}
