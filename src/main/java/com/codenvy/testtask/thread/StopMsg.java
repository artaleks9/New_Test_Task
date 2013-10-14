package com.codenvy.testtask.thread;

import java.util.Scanner;

public class StopMsg extends Thread {
	
	public void run() {
		String stop = null;
		if(isDaemon()){
				do{
					System.out.println("This message will print on screen until you'll enter stop");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.err.println(e);				
					}	
				}while(stop!="stop"); 
		}		
				Scanner sc = new Scanner(System.in);
					if(sc.hasNext("stop")){
						stop = sc.next("stop");
					}
					sc.close();
	}
	
	public static void main(String[] args) {
		StopMsg t = new StopMsg();
		StopMsg d = new StopMsg();
		d.setDaemon(true);
		t.start();
		d.start();
	}
}

