/**
 * File Name: ArraysInClass.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.ks;

public class ArraysInClass {

	// Write a method which takes a parameter of array of int and print the size
	// of any array
	//
	public static void calcSizeOfAnArray(int[] myArray) {
		System.out.println("size of array is" + myArray.length);
	}

	// Form1 Declare an array of char with 5 element
	public static void charArrayPractice() {
		char[] letters = { 'k', 'r', 'i', 's', 'h' };
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
		}
		System.out.println();
	}

	// an array of int and initialize elements in the array
	public static void elementsOfArray() {
		int[] number = new int[3];
		number[0] = 3;
		number[1] = 4;
		number[2] = 5;
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
	// Write a method which takes a parameter of array of String and print all
	// the items in the array using a for or for-each loop

	public static void PrintItemsInArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}

	/**
	 *
	 */
	public static void simpleArrayPractice() {
		// form2 Declare an array of char with 5 element
		char[] letter = new char[5];
		letter[0] = '3';
		letter[1] = '2';
		letter[2] = '6';
		letter[3] = '8';
		letter[4] = '9';
		for (char c : letter) {
			System.out.println(c);
		}
	}

	// a parameter of array of int and print the size of any array.
	public static void sizeOfArray(int[] intArray) {
		// int[] parameter = new int[10];
		// System.out.println(parameter.length);
		// String[] fruit = { "strawberry", "blueberry", "raspberry" };
		// for (int i = 0; i < intArray.length; i++) {
		System.out.println("The size of the passed array is " + intArray.length);
		// }
	}
}
