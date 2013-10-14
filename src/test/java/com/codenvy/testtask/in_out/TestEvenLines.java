package com.codenvy.testtask.in_out;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEvenLines {
	int count = 17;
	String s = "d:\\A\\myText.txt";
	EvenLines evl = new EvenLines();
	
	@Test
	public void EvenLines() {
		assertEquals(count,evl.prEvenLn(s));
	}
}
