package com.merchant.demo;


public class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		method(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

	private static void method(int a, int b) {
		a = new Integer(100);
		b = new Integer(100);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.exit(0);
	}

}
