package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Probelm4.java 
 * This program solves problem 4-1 
 * September 22, 2017
 * @author Naomi Cheung
 *
 */
public class Probelm4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
				
				int burger=sc.nextInt();	
				int side=sc.nextInt();
				int drink=sc.nextInt();
				int dessert=sc.nextInt();
				// sets a chosen burger to a calorie
				int calorie=0;
				if (burger==1) {
					calorie +=461;
				}
				else if (burger==2) {
					calorie+=431;
				}
				else if (burger==3) {
					calorie+=420;
				}		
				else if (burger==4) {
					calorie+=0;
				}
				else {
					System.out.print("error");
				}				
				// sets the chosen side to a calorie
				
				if (side==1) {
					calorie+=100;
				}
				else if (side==2) {
					calorie+=57;
				}
				else if (side==3) {
					calorie+=70;
				}
				else if (side==4) {
					calorie+=0;
				}
				else {
					System.out.print("error");
				}
				// sets a chosen drink to a calorie
			
				if (drink==1) {
					calorie+=130;
				}
				else if (drink==2) {
					calorie+=160;
				}
				else if (drink==3) {
					calorie+=118;
				}
				else if (drink==4) {
					calorie+=0;
				}
				else {
					System.out.print("error");
				}
				
				
				// sets the chosen dessert to a calorie
				if (dessert==1) {
					calorie+=167;
				}
				else if (dessert==2) {
					calorie+=266;
				}
				else if (dessert==3) {
					calorie+=75;
				}
				else if (dessert==4) {
					calorie+=0;
				}
				else {
					System.out.print("error");
				}
		
				System.out.print("Your total calorie count is " + calorie + ".");
					
	}

}
