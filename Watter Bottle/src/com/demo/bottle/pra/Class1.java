package com.demo.bottle.pra;

public class Class1 extends Thread {

	static int total=0;
	
	Class2 c2 = new Class2();
	//	@Override
	public void run() {
		
				run1();	
				
		}
		public synchronized void run1() {
			
			for (int i = 1; i < 10; i++) {
					total = total +i;
					
					System.out.println("Hello");
					
					this.notify();			
			}
	}
	
}
