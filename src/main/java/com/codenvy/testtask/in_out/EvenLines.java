package com.codenvy.testtask.in_out;

import java.io.*;

public class EvenLines {
		
	public int prEvenLn(String s) {
		int sumEvLn = 0;
		int c;
		String str;
		try {
			File myFile = new File(s);
			FileReader fr = new FileReader(myFile);
			LineNumberReader lnr = new LineNumberReader(fr);
			while ((str = lnr.readLine()) != null) {
				c = lnr.getLineNumber();
				if (c % 2 == 0) {
					System.out.println(str);
					sumEvLn++;
				}	
			}
			lnr.close();
		} catch (IOException e) {
				System.out.println("Error!Have a problem with a file \n"
					+ e.toString());
		}
		return sumEvLn;
	}

	public static void main(String[] args) {
		EvenLines evl = new EvenLines();
		evl.prEvenLn("d:\\A\\myText.txt");
	}
}
