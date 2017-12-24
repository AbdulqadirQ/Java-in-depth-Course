package com.abdulqadirprojects.indepthJava.section4;

public class LabelledBreak {

	public static void main(String[] args) {
		
		labelledBreak();

	}
	
	static void labelledBreak() {
		
		int num = 0;
		
		outermost: for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(i == 5 && j ==5) {
					break outermost;
				}
				num++;
			}
		}
		
		System.out.println("num: " + num); // prints 55
	}

}
