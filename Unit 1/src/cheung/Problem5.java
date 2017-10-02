package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem5.java 
 * This program is to print out the Mama bear's weight of porridge
 * September 26, 2017
 * @author Naomi Cheung
 *
 */

public class Problem5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		try {	
			System.out.println("This program finds out the weight of Mama bear's porridge compared to Papa bear's and Baby bear's");
			System.out.println("List one weight of porridge.");
			String porridge1=in.readLine();
			int a=Integer.parseInt(porridge1);
			System.out.println("List one weight of porridge.");
			String porridge2=in.readLine();
			int b= Integer.parseInt(porridge2);
			System.out.println("List one weight of porridge.");
			String porridge3=in.readLine();
			int c=Integer.parseInt(porridge3);	

			//finds out which bowl is mama bear's
			if (a>b && a>c || a<b && a>c){
				System.out.print("Mama bear's porridge bowl is " + a);
			}
			else if (b>a && b<c || a<b && c>b) {
				System.out.print("Mama bear's porridge bowl is " + b);
			}
			else if (c>a && c>b || a>c && b>c) {
				System.out.print("Mama bear's porridge bowl is " + c);
			}
			else {
				System.out.print("error");
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			

	}

}
