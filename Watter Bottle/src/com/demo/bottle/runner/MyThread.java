package com.demo.bottle.runner;

public class MyThread extends Thread {

	@Override
	public synchronized void run() {
		for(int i = 0;i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
	
}
