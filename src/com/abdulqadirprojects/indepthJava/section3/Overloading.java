package com.abdulqadirprojects.indepthJava.section3;

public class Overloading {

	public static void main(String[] args) {
		
		// int literal 22 invokes the int method by default
		go(22);
		
		byte b = 22;
		// byte variable b invokes the most specific method by default (i.e. short method)
		go(b);

	}
	
	static void go(int i) {
		System.out.println("int method: " + i);
	}
	
	static void go(short s) {
		System.out.println("short method: " + s);
	}


}
