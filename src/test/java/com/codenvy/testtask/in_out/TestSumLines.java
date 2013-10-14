package com.codenvy.testtask.in_out;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSumLines {
	int count = 43;
	String s = "d:\\A\\myfile.txt";
	SumLines sumL = new SumLines();
	
	@Test
	public void testCountLines1() {
		assertEquals(count,sumL.countLines(s));
	}
	
}
