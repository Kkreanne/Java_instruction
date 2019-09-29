package bmdb_console;

public class Credit {

	private int movieId;
	private int actorId;
	private String role;
	
	
	public Credit() {
		movieId = 0;
		actorId = 0;
		role = "";
	}
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String toString() {
		String message = "\tRole: " + role + "\n";
		return message;
	}
	
}
