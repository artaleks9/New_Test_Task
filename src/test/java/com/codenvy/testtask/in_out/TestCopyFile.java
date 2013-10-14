package com.codenvy.testtask.in_out;

import static org.junit.Assert.*;
import java.io.File;

import org.junit.Test;

public class TestCopyFile {
	String myfile = "d:\\A\\myfile.txt";
	File myFile = new File(myfile); 
	String myChar = "d:\\A\\mychar.txt";
	CopyFile cf = new CopyFile();
	
	@Test
	public void testCopyFile(){
		assertSame(myFile,cf.copyChar(myChar, myfile));
	}
}
