/**
 * File Name: UserRegistration.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.ks;

import com.sqa.ks.helpers.*;

/**
 * UserRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class UserRegistration {

	public static void registerUser() {
		String[] names;
		String[] ages;
		String[] addresses;
		String[] jobTitles;
		int numOfUsers =
				AppBasics.requestIntFromUser("How many employees would you like to register into the system?", 1, 5);
		names = new String[numOfUsers];
		ages = new String[numOfUsers];
		addresses = new String[numOfUsers];
		jobTitles = new String[numOfUsers];
		for (int i = 0; i < numOfUsers; i++) {
			names[i] = AppBasics.requestInfoFromUser("what is empployee #" + (i + 1) + "'s name?");
			ages[i] = AppBasics.requestInfoFromUser("what is " + names[i] + " + " + " 's age?");
			addresses[i] = AppBasics.requestInfoFromUser("what is " + names[i] + " + " + "'s address?");
			jobTitles[i] = AppBasics.requestInfoFromUser("what is " + names[i] + " + " + "'s job title?");
		}
		for (int i = 0; i < jobTitles.length; i++) {
			System.out.println("\n" + names[i] + " (" + ages[i] + ")");
			System.out.println("t" + jobTitles[i]);
			System.out.println("t" + addresses[i]);
		}
	}
}