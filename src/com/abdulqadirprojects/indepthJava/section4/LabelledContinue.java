package com.abdulqadirprojects.indepthJava.section4;

public class LabelledContinue {

	public static void main(String[] args) {
		
		labelledBreak();
		test();
	}
	
	static void labelledBreak() {
		
		int num = 0;
		
		outermost: for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(i == 5 && j ==5) {
					continue outermost;
				}
				num++;
			}
		}
		
		System.out.println("num: " + num); // prints 95
	}
	
	static void test() {
		int x = 'a';
		System.out.println(x);
	}

}
