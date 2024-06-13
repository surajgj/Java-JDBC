package com.demo.bottle.pra;

public class Class2 {

	
	
	public static void main(String[] args) throws InterruptedException {
		Class1 c1 = new Class1();
		c1.start();
		System.out.println("jhj");
		System.out.println(c1.total);
		c1.join();
		System.out.println(c1.total);
		System.out.println("main");
		
		
	}
	
}
