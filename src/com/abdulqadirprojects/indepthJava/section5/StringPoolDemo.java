package com.abdulqadirprojects.indepthJava.section5;

public class StringPoolDemo {

	public static void main(String[] args) {
		stringPool();

	}
	
	static void stringPool() {
		  String s1 = "hello!";
		  String s2 = "hello!";
		  String s3 = "hello!".intern();
		  String s4 = new String("hello!");	 
		  String s5 = "lo!";

	      System.out.println("s1 == s2: " + (s1 == s2)); // true
	      System.out.println("s1 == s3: " + (s1 == s3)); // true
	      System.out.println("s1 == s4: " + (s1 == s4)); // false
	      System.out.println("s1 == s4.intern(): " + (s1 == s4.intern())); // true
	      System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!"));//  true
	      
	      // Since s5 is a variable, it doesn't get evaluated until runtime. It would therefore not
	      // be considered as a literal. This can be fixed if s5 made final, therefore forcing it to
	      // be evaluated at compile-time 
	      System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5)); // false
	      
	      
	}

}
