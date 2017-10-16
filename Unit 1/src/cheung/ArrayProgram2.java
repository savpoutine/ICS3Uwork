package cheung;

import java.util.Scanner;

/**
 * ArrayProgram2.java
 * This program is a guessing game
 * October 11, 2017
 * @author Naomi Cheung
 *
 */
public class ArrayProgram2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in); 
		System.out.println("Hi let's play a guessing game. Think of a dessert and reply yes or no do each dessert listed, press enter when ready to start.");
		String [] dArray= {"a cheesecake", "a cupcake", "a brownie", "a cake pop", "a butter tart", "a egg tart", "a apple pie", "a pumpkin pie", "a maccaroon", "a tiramisu", "a trifle", "canollies", "ice cream", "turnovers", " a pie", "chocolate chip cookies", "cookies", "crepes", "waffles", "wooffles"};   
		// displays guess
		for (int i=0;i<dArray.length; i++) {
			System.out.println("Is it " + dArray[i]);
			String a=sc.nextLine();
			if ( a.equalsIgnoreCase("yes")){
				System.out.println("I win");
				break;
			}
			if (a.equalsIgnoreCase("no")&& i==dArray.length-1){
				System.out.println("You win");
				break;
			}

		}

	}

}
