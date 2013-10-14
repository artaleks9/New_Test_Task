package com.codenvy.testtask.thread;

/**
 * A simple counter class that can be a thread- safe . 
 * Has a specific value and increment.
 * @author Aleks
 */

public class Counter {

	private int count = 0;

	public synchronized int getCount(){
		return count;
	}
	
	public synchronized int icrement(){
		return ++count;
	}

}
