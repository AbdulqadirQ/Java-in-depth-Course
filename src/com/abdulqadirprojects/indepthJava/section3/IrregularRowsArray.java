package com.abdulqadirprojects.indepthJava.section3;

public class IrregularRowsArray {

	public static void main(String[] args) {
		System.out.println("Creating a regular array:\n ");
		createRegularArray();

		System.out.println("\nCreating an irregular array:\n ");
		createIrregularArray();
	}
	
	public static void createRegularArray() {
		
		int[][] regularArr = new int[3][5];
		
		for(int i = 0; i < regularArr.length; i++) {
			
			for(int j = 0; j < regularArr[i].length; j++) {
				System.out.print(" " + regularArr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void createIrregularArray() {
		
		int[][] irregularArr = new int[3][];
		irregularArr[0] = new int[10];
		irregularArr[1] = new int[3];
		irregularArr[2] = new int[6];
		
		
		for(int i = 0; i < irregularArr.length; i++) {
			
			for(int j = 0; j < irregularArr[i].length; j++) {
				System.out.print(" " + irregularArr[i][j]);
			}
			System.out.println();
		}
		
	}

}
