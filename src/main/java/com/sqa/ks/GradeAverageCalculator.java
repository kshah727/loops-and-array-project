/**
 * File Name: GradeAverageCalculator.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 19, 2017
 */
package com.sqa.ks;

import com.sqa.ks.helpers.*;

public class GradeAverageCalculator {

	static int numOfGrades;

	static int totalOfGrades;

	static double gradeAverage;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "Grade Calculator";
		// String userName = AppBasics.greetUserandGetName(appName);
		calculateGrade();
		// AppBasics.farewellUser(userName, appName);
	}

	private static void calculateGrade() {
		numOfGrades = AppBasics.requestIntFromUser("How many grades would you like to input into the system?");
		int i = 1;
		do {
			totalOfGrades += AppBasics.requestIntFromUser("Could I get grade #" + i + ";", 0, 100);
			i++;
		} while (i <= numOfGrades);
		gradeAverage = totalOfGrades / numOfGrades;
		System.out.printf("Based on those grades, you would receive a %.1f%% average.", gradeAverage);
	}
}
