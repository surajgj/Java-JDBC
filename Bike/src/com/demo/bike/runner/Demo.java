package com.demo.bike.runner;


class Display {
	    public void wish(String name) {
	        System.out.println("Start of wish method");
	        synchronized () {
	            for (int i = 0; i < 5; i++) {
	                System.out.println(name);
	            }
	        }
	        System.out.println("End of wish method");
	    }
	}

	class Mythread extends Thread {
	    Display d;
	    String name;

	    Mythread(Display d, String name) {
	        this.d = d;
	        this.name = name;
	    }

	    public void run() {
	        d.wish(name);
	    }
	}

	public class Demo {
	    public static void main(String[] args) {
	        Display d1 = new Display();
	        Display d2 = new Display();

	        Mythread t1 = new Mythread(d1, "sharath");
	        Mythread t2 = new Mythread(d2, "shara");

	        t1.start();
	        t2.start();
	    }
	}

