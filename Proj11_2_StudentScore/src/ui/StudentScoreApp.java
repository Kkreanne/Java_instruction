package ui;

import java.util.Arrays;

import business.Student;
import util.Console;

public class StudentScoreApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Scores App!\n");
		
		int nbr = Console.getIntWithinRange("How many students?", 0, 501);
		
		Student[] students = new Student[nbr];
		
		for (int i=0; i < nbr; i++) {
			String lastName = Console.getString("Student Last Name: ");
			String firstName = Console.getString("Student First Name: ");
			int score = Console.getIntWithinRange("Score:  :" , -1, 101);
			Student s = new Student(firstName, lastName, score);
			students[i] = s;
		}
		
		System.out.println("SUMMARY");
		Arrays.sort(students);
		for (Student s: students) {
			System.out.println(s); //automatically calls the toString method from Student Class
		}
		
		System.out.println("Goodbye!");
	}


}
