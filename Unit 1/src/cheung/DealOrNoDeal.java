package cheung;

import java.util.Scanner;
/**
 * DealOrNoDeal.java
 * This program is to respond to the game deal or no deal with input
 * October 18, 2017
 * @author Naomi Cheung
 *
 */
public class DealOrNoDeal {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter the amount of boxes opened.");
		int boxes =sc.nextInt();
		System.out.println("Please enter the value of the boxes and press enter after each value.");
		//array for the values of the box
		int[] vArray= new int [boxes];
		for (int i=0; i<vArray.length; i++) {
			vArray[i]=sc.nextInt();
		}
		System.out.println("What did the bank offer");
		int offer=sc.nextInt();
		int total=0;
		int average;
		//calculating the average
		
		for (int i=1;i<boxes;i++){
			total=total+vArray[i];
			average=total/boxes;
			if (offer>average) {
				System.out.println("deal");			
			}
			else {
				System.out.println("no deal");
			}
		}
		System.out.print("Please use the last deal or no deal outputed.");
	}

}
