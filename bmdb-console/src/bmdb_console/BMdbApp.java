package bmdb_console;


public class BMdbApp {

		public static void main(String[] args) {

			System.out.println("Welcome to the Best Movie Database! \n");
			
			Movie movie1 = new Movie();
			
			movie1.setId(1);
			movie1.setTitle("Long Shot");
			movie1.setYear(2019);
			movie1.setRating("81");
			movie1.setDirector("Jonathan Levine");
			
			Movie movie2 = new Movie();
			
			movie2.setId(2);
			movie2.setTitle("The Interview");
			movie2.setYear(2014);
			movie2.setRating("51");
			movie2.setDirector("Seth Rogen & Evan Goldberg");
			
			Actor actor1 = new Actor();
			
			actor1.setId(1);
			actor1.setFirstName("Charlize");
			actor1.setLastName("Theron");
			actor1.setGender("Female");
			actor1.setBirthDate("08-07-1975");
			
			Actor actor2 = new Actor();
			
			actor2.setId(2);
			actor2.setFirstName("Seth");
			actor2.setLastName("Rogan");
			actor2.setGender("Male");
			actor2.setBirthDate("04-15-1982");
			
			Actor actor3 = new Actor();
			
			actor3.setId(3);
			actor3.setFirstName("James");
			actor3.setLastName("Franco");
			actor3.setGender("Male");
			actor3.setBirthDate("04-19-1978");
			
			Credit credit1 = new Credit();
			
			credit1.setActorId(1);
			credit1.setMovieId(1);
			credit1.setRole("Charlotte Field, the most influential woman in the world.");
			
			Credit credit2 = new Credit();
			
			credit2.setActorId(1);
			credit2.setMovieId(1);
			credit2.setRole("Fred Flarsky, a gifted and free-spirited journalist.");
			
			Credit credit3 = new Credit();
			
			credit3.setActorId(1);
			credit3.setMovieId(1);
			credit3.setRole("David Skylark, host of popular tabloid-TV show 'Skylark Tonight'.");
			
			System.out.println(movie1.toString());
			System.out.println(actor1.toString());
			System.out.println(credit1.toString());
			System.out.println(actor2.toString());
			System.out.println(credit2.toString());
			
			System.out.println(movie2.toString());
			System.out.println(actor2.toString());
			System.out.println(credit2.toString());
			System.out.println(actor3.toString());
			System.out.println(credit3.toString());
			
		}

	}
