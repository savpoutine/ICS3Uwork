package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem1.java
 * This program is to print out a calendar
 * September 28, 2017
 * @author Naomi Cheung
 *
 */
public class Problem1 {

	public static void main(String[] args) {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("Which day of the week does the month start on? Please use a number, for example 1=Sunday, etc.");
			String day=in.readLine();
			int start =Integer.parseInt(day);
			System.out.println("How many days are there in the month");
			String month=in.readLine();
			int days=Integer.parseInt(month);
			// prints the days of the week with no numbers yet
			System.out.println("Sun\tMon\tTues\tWed\tThurs\tFri\tSat\t");
			// shows where to put the first number on the calendar 
			for (int i=1; i<start; i++) {
				System.out.print("\t");
			}
			int line=1;
			for (int y=1; y<=days; y++) {
				System.out.print(y+"\t");
				if (y<1) {
					System.out.print("\t");
				}
				int num=(y+start-1)/line;
				//makes the number go to the next line if it is at the end of the week
				if (num==7) {
					System.out.println("\t ");
					line++;
				}				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
