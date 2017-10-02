package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem3.java
 * This program makes a trident
 * September 27, 2017
 * @author Naomi Cheung 
 *  
 */
public class Problem3 {

	public static void main(String[] args) {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("This program prints a trident");
			System.out.println("How tall do you want the tines to be?");
			String tine = in.readLine();
			int t= Integer.parseInt(tine);
			System.out.println("How many spaces in between each tine do you want?");
			String space=in.readLine();
			int s=Integer.parseInt(space);
			System.out.println("How tall do you want the handle to be?");
			String handle=in.readLine();
			int h=Integer.parseInt(handle);
			int l=3+s*2;
			
			// prints the tines of the trident
			for (int i=0; i<t; i++) {
				for (int j=0; j<3; j++) {	
					System.out.print("*");
					for (int k=0; k<s; k++) {
						System.out.print(" ");
					}
				}
				System.out.println(" ");
			}	
			
			//prints a base row for the trident below the tines and above the handle
			for (int i=0; i<l; i++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
			// prints the handle of the trident
			for (int i=0; i<h; i++) {
				for (int ii=0; ii<s+1; ii++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}

		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





