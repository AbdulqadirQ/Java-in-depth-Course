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
		
		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0041';
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x41;
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b01000001;
		System.out.println("charBinary: " + charBinary);
		
	}

}
