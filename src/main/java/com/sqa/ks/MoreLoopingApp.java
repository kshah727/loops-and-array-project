/**
 * File Name: MoreLoopingApp.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 20, 2017
 */
package com.sqa.ks;

public class MoreLoopingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 10; i >= 5; i--) {
			System.out.print(i + ",");
		}
		System.out.println();
		for (int i = 0; i <= 5; i++) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		for (int i = 1000; i >= 8; i = i / 5) {
			System.out.print(i + "<<<<");
		}
		// System.out.println();
		// for (int i = -10 i >= -1; i = i / 3) {
		// System.out.print(i + "{");
	}
}