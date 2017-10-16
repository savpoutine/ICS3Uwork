package cheung;

import java.util.Scanner;

/**
 * ArrayProgram1.java
 * This program prints out your output after rolling two dices after 10000 rolls
 * October 11, 2017
 * @author Naomi Cheung
 * 
 */
public class ArrayProgram1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int [] dArray= new int[11];
		//rolls the dice and sets the value in the array
		for (int i=0; i<10000; i++) {
			int dice =(int) (Math.random()*6+1);
			int dice2= (int)(Math.random()*6+1);
			int value=(dice+dice2);
			dArray[value-2]++;
		}
		//prints out the number of times each value was rolled
		System.out.println("Total" + "\t" + "Number of rolls");
		for (int i=0; i<dArray.length; i++) {
				System.out.println(i+2+"\t"+ dArray[i]);
			}
		
		
		
		
	}

}
