/**
 * File Name: Loops.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 19, 2017
 */
package com.sqa.ks;

public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "Loops";
		// String userName = AppBasics.greetUserandGetName(appName);
		count();
		evenNumbersfrom1to100();
		oddNumbersfrom1to100();
		oddNumbersdivisibleby3();
		char mathgrade;
		// AppBasics.farewellUser(userName, appName);
	}

	// program which prints out a count from 1 to 100
	private static void count() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			if (i < 100) {
				System.out.print(", ");
			}
		}
		System.out.println();
		for (int i = 200; i >= 100; i--) {
			System.out.print(i);
			if (i > 100) {
				System.out.print(", ");
			}
		}
		// 10-1000 with only numbers evenly divided by 10
		System.out.println();
		for (int i = 10; i <= 10000; i = i + 10) {
			System.out.print(i);
			if (i < 10000) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	private static void evenNumbersfrom1to100() {
		// initizalizing i and setting to 1
		int i = 1;
		// doing a loop until condition is no longer true
		while (i <= 100) {
			// check that there is no remainder when dividing by 2 (divisible)
			if (i % 2 == 0) {
				// print out the number for i for current iteration
				System.out.print(i);
				// check if the number is not the last number counting to
				if (i < 100) {
					// print the number if its not the last number
					System.out.print(", ");
				}
			}
			// increment 1 by 1 at the end of every iteration
			i++;
		}
		// print a new line so that next method does not start on same line
		System.out.print("\n");
	}
	//

	private static void oddNumbersdivisibleby3() {
		// initizalizing i and setting to 1
		int i = 30;
		// doing a loop until condition is no longer true
		while (i <= 333) {
			// check that there is a remainder when dividing by 2 (not
			// divisible)
			if (i % 3 == 0) {
				// print out the number for i for current iteration
				System.out.print(i);
				// check if the number is not the last number counting to
				if (i < 300) {
					// print the number if its not the last number
					System.out.print(", ");
				}
			}
			// increment 1 by 1 at the end of every iteration
			i++;
		}
		// print a new line so that next method does not start on same line
		System.out.print("\n");
	}

	//
	private static void oddNumbersfrom1to100() {
		// initizalizing i and setting to 1
		int i = 1;
		// doing a loop until condition is no longer true
		while (i <= 100) {
			// check that there is a remainder when dividing by 2 (not
			// divisible)
			if (i % 2 != 0) {
				// print out the number for i for current iteration
				System.out.print(i);
				// check if the number is not the last number counting to
				if (i < 100) {
					// print the number if its not the last number
					System.out.print(", ");
				}
			}
			// increment 1 by 1 at the end of every iteration
			i++;
		}
		// print a new line so that next method does not start on same line
		System.out.print("\n");
	}
}
//