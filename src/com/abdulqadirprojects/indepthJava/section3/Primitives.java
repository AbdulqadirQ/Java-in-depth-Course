package com.abdulqadirprojects.indepthJava.section3;

public class Primitives {

	public static void main(String[] args) {

		primitivesExamples();

	}
	
	static void primitivesExamples() {
		
		int intHex = 0x41;
		System.out.println("Hex literal: " + intHex);
		
		int intBin = 0b01000001;
		System.out.println("Binary literal: " + intBin);
		
		int intOct = 0101;
		System.out.println("Octal literal: " + intOct);
		
		int intUnderscore = 1_23_456;
		System.out.println("Underscore notation: " + intUnderscore);
		
	}

}
