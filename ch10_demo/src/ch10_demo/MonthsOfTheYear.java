package ch10_demo;

public enum MonthsOfTheYear {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

	@Override
	public String toString() {
		String nameOfMonth = "";
		if (this.name().equals("JANUARY")) {
			nameOfMonth = "The month is January";
		} 
		return nameOfMonth;
	}
	
}
