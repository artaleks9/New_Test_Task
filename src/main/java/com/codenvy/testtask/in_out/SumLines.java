package com.codenvy.testtask.in_out;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SumLines {

	public int countLines(String s) {
		int sum = 0;
		try {
			File myFile = new File(s);
			FileReader fr = new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);

			while ((br.readLine()) != null) {
				sum++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Error!Have a problem with a file \n"
					+ e.toString());
		}
		System.out.println("Sum of lines is: " + sum);
		return sum;
	}
}
