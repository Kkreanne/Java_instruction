package ch10_demo;

public class MonthEnumApp {

	public static void main(String[] args) {
		MonthsOfTheYear january = MonthsOfTheYear.JANUARY;
		System.out.println(january.name());
		System.out.println(january.ordinal());
		System.out.println(january.toString());
	}

}
