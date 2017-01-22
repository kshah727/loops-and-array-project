/**
 * File Name: ArraysInClassTest.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.ks;

import org.junit.*;

/**
 * ArraysInClassTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class ArraysInClassTest {

	@Test
	public void testCalcSizeOfAnArray() {
		ArraysInClass.charArrayPractice();
	}

	@Test
	public void testCharArrayPractice() {
		ArraysInClass.charArrayPractice();
	}

	@Test
	public void testElementsOfArray() {
		ArraysInClass.elementsOfArray();
		;
	}

	@Test
	// LEARN
	public void testPrintItemsInArray() {
		String[] stringArray = { "hat", "shirt", "pants" };
		ArraysInClass.PrintItemsInArray(stringArray);
	}

	@Test
	public void testSimpleArrayPractice() {
		ArraysInClass.simpleArrayPractice();
		;
	}

	@Test
	// LEARN
	public void testSizeOfArray() {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		ArraysInClass.sizeOfArray(intArray);
	}
}
