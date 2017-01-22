/**
 * File Name: ArraysPractice.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.ks;

import java.util.*;

/**
 * ArraysPractice //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class ArraysPractice {

	public static void sampleArrays() {
		int[] number = new int[5];
		number[0] = 4;
		number[1] = 8;
		number[2] = 9;
		number[3] = 1;
		number[4] = 0;
		String[] words = { "ks", "krishna", "krishna shah" };
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		Arrays.sort(number);
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
