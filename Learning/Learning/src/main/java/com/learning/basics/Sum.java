package com.learning.basics;

class Sum {
	// static variable
	static int a = 10;
	static int b;

	private static void sysout() {
		System.out.println("hello");

	}

	// static block
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}

	public static void main(String[] args) {

		sysout();
//		System.out.println("from main");
//		System.out.println("Value of a : " + a);
//		System.out.println("Value of b : " + b);
	}
}