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
		int boxes;
		int boxNumber;
		int [] vArray= {100, 500, 1000, 5000, 10000, 25000, 50000,100000,500000,1000000};
		//array for the box
		boxes=sc.nextInt();
		for (int i=0; i<boxes;i++) {
			boxNumber=sc.nextInt();
			vArray[boxNumber-1]=0;
		}
		int offer=sc.nextInt();
		int total=0;
		int average = 0;
		//calculating the average
		for (int i=0; i<vArray.length; i++) {
			total=total+vArray[i];
		}
		average=total/(vArray.length-boxes);
			
		if (offer>average) {
			System.out.println("deal");			
		}
		else {
			System.out.println("no deal");
		}
		
	}

}
