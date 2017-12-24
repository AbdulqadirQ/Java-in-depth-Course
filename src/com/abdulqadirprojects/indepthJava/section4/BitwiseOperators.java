package com.abdulqadirprojects.indepthJava.section4;

public class BitwiseOperators {

	public static void main(String[] args) {
		bitwiseOperators();
	}
	
	static void bitwiseOperators() {
		
		int x = 1;
		int y = 3;
		
		System.out.println("x & y: " + (x & y));
		System.out.println(("x | y: " + (x | y)));
		System.out.println("x ^ y: " + (x ^ y));
		System.out.println("~x: " + (~x));
		System.out.println("true & false: " + (true & false));
		
		char c1 = 'a'; // U+0061 --> 0110 0001
		char c2 = 'b'; // U+0062 --> 0110 0010
		System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal
		
	}

}
