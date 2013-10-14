package com.codenvy.testtask.in_out;

import java.io.*;

public class CopyFile {

	public File copyChar(String s,String file) {
		File myChar = new File(s);
		try {
			myChar.createNewFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(myChar);
			BufferedWriter bw = new BufferedWriter(fw);
			int c;
			while ((c = br.read()) != -1) {
				bw.write(c);
			}
			br.close();
			bw.close();
		} catch (IOException e) {
				System.out.println("Error!Have a problem with a file \n"
					+ e.toString());
		}
		return myChar;
	}

	public static void main(String[] args) {
		CopyFile cf = new CopyFile();
		cf.copyChar("d:\\A\\mychar.txt","d:\\A\\myfile.txt");
	}
}
