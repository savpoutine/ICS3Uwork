package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem2.java
 * This program prints a bow tie
 * September 29, 2017
 * @author Naomi Cheung
 *
 */
public class Problem2 {

	public static void main(String[] args) {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Please enter the height of the bowtie, an odd number");
			String height = in.readLine();
			int h =Integer.parseInt(height);
			int s, a;
			s=h*2-2;
			a=1;
			//makes sure a number has been inputed 
			if (h%2 !=0) {
				for (int i=1; i<=h; i++) {
					for (int j=1; j<=a; j++) {
						System.out.print("*");
					}
					//puts spacing to created a bow tie shape
					for (int l=1; l<=s; l++) {
						System.out.print(" ");
					}
					for (int j=1; j<=a; j++) {
						System.out.print("*");
					}
					//reverses the spacing to make it aligned for other side of bow tie
					if (i<=h/2) {
						a+=2;
						s-=4;
					}
					else {
						a-=2;
						s+=4;
					}
					System.out.println("");
				}
				
			}
			else {
				System.out.print("Error, please restart the program");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
