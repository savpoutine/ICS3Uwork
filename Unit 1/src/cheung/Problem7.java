package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem7.java
 * This program is to figure out different ways to hold up numbers up to 10
 * September 27, 2017
 * @author Naomi Cheung
 *
 */
public class Problem7 {

	public static void main(String[] args) {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Enter a number between 1-10");
			String input;
			input = in.readLine();
			int num=Integer.parseInt(input);
			//finds out how many ways the numbers can be put on two hands
			int output= (int) (Math.sqrt(num) + 1);		
			System.out.print("Your number can be put on two hands " + output + "ways.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
