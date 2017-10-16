package cheung;


import java.util.Scanner;
/**
 * PracticeProblemA.java
 * This program reads a list of names and prints it the the same order then in reverse
 * October 10, 2017
 * @author Naomi Cheung
 *
 */
public class PracticeProblemA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("Using a number, say how many names you would like to print.");
			String num= sc.nextLine();
			int n= Integer.parseInt(num);  			
			System.out.println("Write that many names and press enter when done.");
			String [] nArray= new String [n];
			//puts each inputed name to an array
			for (int i=0; i<nArray.length; i++) {
				nArray[i]=sc.nextLine();
			}
			//outputs names forward
			for (int i=0; i<nArray.length; i++) {
				System.out.println(nArray[i]);
			}
			//outputs name backwards
			for (int i=nArray.length-1; i>=0; i--) {
				System.out.println(nArray[i]);
			}
			
			
			
					
		

	}

}
