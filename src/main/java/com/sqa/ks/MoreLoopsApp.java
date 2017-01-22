/**
 * File Name: MoreLoopsApp.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.ks;

/**
 * MoreLoopsApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class MoreLoopsApp {

	public static void LoopThroughStars() {
		int numOfLines = 6;
		int numOfStars = 6;
		for (int i = 0; i < numOfLines; i++, numOfStars--) {
			for (int j = 0; j < numOfStars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
