package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Probelm6.java 
 * This program is to print out the proper ISBN numbers
 * September 27, 2017 
 * @author Naomi Cheung
 *
 */
public class Probelm6 {

	public static void main(String[] args) {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

		try {
			int iSBN=91;
			System.out.print("Write a number");
			String num1 = in.readLine();
			int numA =Integer.parseInt(num1);
			System.out.print("Write a different number");
			String num2 = in.readLine();
			int numB=Integer.parseInt(num2);
			System.out.print("Write another different number");
			String num3 = in.readLine();
			int numC=Integer.parseInt(num3);
			int output;
			// adds the three new numbers to the ISBN 
			output=numA*1+numB*3+numC*1+iSBN;
			System.out.print("The 1-3-sum is " + output + ".");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
