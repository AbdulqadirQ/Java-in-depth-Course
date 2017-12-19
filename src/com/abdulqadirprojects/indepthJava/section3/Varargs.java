package com.abdulqadirprojects.indepthJava.section3;

public class Varargs {

	public static void main(String[] args) {
		
		varargsOverload(true, 1, 2, 3); // calls method without varargs since it's possible
		varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
		varargsOverload(true); // calls method with varargs with zero int arguments

	}
	
	static void varargsOverload(boolean b, int i, int j, int k) {
		System.out.println("\nInside varargsOverload without varargs...");
	}
	static void varargsOverload(boolean b, int...list) {
		System.out.println("\nInside varargsOverload with varargs...");
		System.out.println("list.length: " + list.length);
	}

}
