package com.codenvy.testtask.base;

import java.util.Scanner;


public class RandomNumber {

	
	public static void main(String[] args) {
		int numProg;
		int numUser;
		int numTry=0;
		numProg = (int)(Math.random() * 10) + 1;
		System.out.println("Try to guess the integer number from 1 to 10");
		System.out.print("Enter your number: ");
		Scanner in = new Scanner(System.in);
		if( in.hasNextInt() ) {
			do {
				numUser = in.nextInt();
				numTry++;
				if(numUser == numProg) {
					System.out.println("You guessed!\nThe number of tries is:  "+numTry);
				} else {
					if (numUser > 0 && numUser <= 10) {
						System.out.print("You didn't guess...\n Try again.");
						if( numProg < numUser ) {
							System.out.println("My number is smaller.");
						} else {
							System.out.println("My number is bigger.");
						}
					} else {
						System.out.println("Your number is from wrong interval");
					}
				}
			} while(numUser != numProg);
			
			} else {
				System.out.println("Error.You entered no integer number!");
			}
			in.close();
			System.out.println("Bye!");
	}

}
