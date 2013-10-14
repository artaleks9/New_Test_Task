package com.codenvy.testtask.thread;

public class TenMsg implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++){
			int m = 1;
			m+=i;
			System.out.println("Message"+m+"  Thread runnable");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new TenMsg());
		t.start();
	}
}