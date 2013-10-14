package com.codenvy.testtask.base;

import java.util.Scanner;

/**
 * public class MultiplicationTable
 * 
 * @created on Oct.2013.
 * @author aleks
 */
public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		int sum = 0;
		System.out.print("Enter natural number from 1 to 9 : ");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
			if (i >= 1 && i <= 9) {
				for (int m = 1; m <= 9; m++) {
					sum = i * m;
					System.out.println(m + "   " + sum);
				}
			} else {
				System.out.println("You entered wrong number.");
			}

		} else {
			System.out.println("You entered no natural number.");
		}
		sc.close();
	}
}
