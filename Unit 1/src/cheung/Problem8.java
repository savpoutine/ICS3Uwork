package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem8.java
 * This program prints out the largest side length for a square with a number given
 * September 27, 2017
 * @author Naomi Cheung
 *
 */
public class Problem8 {

	public static void main(String[] args) {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter an amount you would like to find out the largest side length of a square for");
			String num=in.readLine();
			int number=Integer.parseInt(num);
			//finds out the largest side length for the square
			int result=(int) Math.sqrt(number);
			System.out.println("The largest side length for this square is " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
