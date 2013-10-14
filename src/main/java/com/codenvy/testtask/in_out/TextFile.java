package com.codenvy.testtask.in_out;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextFile {

	public static void main(String[] args) throws IOException {
		File myDir = new File("d:\\A");
		myDir.mkdir();
		File myFile = new File(myDir, "myfile.txt");
		myFile.createNewFile();
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("d:\\Bensonhurst.txt");
			out = new FileOutputStream(myFile);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
			System.out.println("Error!Have a problem with a file \n"
					+ e.toString());
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
