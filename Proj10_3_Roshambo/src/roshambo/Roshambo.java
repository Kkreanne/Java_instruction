package roshambo;

public enum Roshambo {
	ROCK,
	PAPER,
	SCISSORS;

	public String toString() {

		String s = "";

		if (this.ordinal() == 0)
			s = "rock";
		if (this.ordinal() == 1)
			s = "paper";
		if (this.ordinal() == 2)
			s = "scissors";
		return s;
	}
	
}
