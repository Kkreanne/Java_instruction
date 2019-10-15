package ui;

import java.util.ArrayList;

import db.MovieIO;
import logic.Movie;
import util.Console;

public class MovieListApp {

	public static void main(String[] args) {
		System.out.println("The Movie List Application\n");
		
		//Console console = new Console();
		MovieIO mIO = new MovieIO();
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Choose from " +mIO.getMovies().size()+" movies.");
			System.out.println("Categories: drama | musical | scifi | horror | comedy | animated ");
			
			String category = Console.getString("Enter a category: ");
			ArrayList<Movie> filteredMovies = mIO.getMovies(category);
			
			for (Movie m: filteredMovies) {
				System.out.println(m.getTitle());
			}
			choice = Console.getString("\nContinue? (y/n) \n");
		}
		System.out.println("Bye!");	
	}
}
