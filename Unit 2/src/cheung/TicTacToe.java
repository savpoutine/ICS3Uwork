package cheung;

import java.util.Scanner;
/**
 * TicTacToe.java
 * This program is a tic tac toe game
 * November 16, 2017
 * @author Naomi Cheung
 *
 */

public class TicTacToe {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		String [][] placements = new String[3][3];
		System.out.println(column());
		System.out.println(board());
		System.out.println(column());
		System.out.println(board());
		System.out.println(column());
		int i=1;
		int counter=0;
		while (i==1||i==2&&check(placements, i)==(false)&&check(placements, i)==(false)&& counter<9){
			if (i==1) {
				System.out.println("Player X, please write the row(1-3) and column(1-3)");
				//subtracts one since arrays start at 0 
				placements [s.nextInt()-1][s.nextInt()-1]= ("X");
				counter++;
				check(placements, i);
				if (check(placements,i)==true) {
					if (i==1) {
						System.out.println("Gave over, X wins, please reastart the program to play again!");
						break;
					}
					else {
						System.out.println("Game over, O wins, please restart the program to play again!");
						break;
					}


				}
				i=2;
			}
			else if (i==2) {
				System.out.println("Player O, please write the row(1-3)and column(1-3)");
				//subtracts one since arrays start at 0
				placements [s.nextInt()-1][s.nextInt()-1]=("O");
				counter++;
				check(placements,i);
				if (check(placements,i)==true) {
					if (i==1) {
						System.out.println("Gave over, X wins, please reastart the program to play again!");
						break;
					}
					else {
						System.out.println("Game over, O wins, please restart the program to play again!");
						break;
					}

				}
				i=1;
			}	

		}
		if (counter ==9 && check(placements,i)==false) {
			System.out.println("No one won, please restart the program to play again.");
		}
	}

	/**
	 * column.java
	 * creates the vertical lines of the grid
	 * @return column
	 */
	public static String column() {
		String column=("\t | \t | ");
		return column;
	}
	/**
	 * board.java
	 * creates the horizontal lines of the grid
	 * @return board
	 */
	public static String board() {
		String board=("-----------------------------" );
		return board;
	}
	/**
	 * check.java
	 * checks to see if any player wins, if not, it returns who just went
	 * @param placements
	 * @param i
	 * @return true or false
	 */
	public static boolean check(String [][] placements, int i) {
		String player=null;
		if (i==1) {
			player="X";
		}
		else {
			player="O";
		}
		if (placements [0][0]==player&& placements [0][1]==player&&placements[0][2]==player) {
			return true;
		}
		else if (placements[1][0]==player &&placements[1][1]==player&&placements[1][2]==player) {

			return true;
		}

		else if (placements [2][0]==player &&placements[2][1]==player &&placements[2][2]==player) {

			return true;
		}
		else if (placements[0][0]==player &&placements[1][0]==player &&placements[2][0]==player) {

			return true;
		}
		else if (placements [0][1]==player&&placements[1][1]==player&&placements[2][1]==player) {

			return true;
		}
		else if (placements [0][2]==player&&placements[1][2]==player&&placements[2][2]==player) {

			return true;
		}
		else if (placements [0][0]==player&&placements[1][1]==player&&placements[2][2]==player) {

			return true;
		}
		else if (placements [0][2]==player&&placements[1][1]==player&&placements[2][0]==player) {

			return true;
		}
		return false;
	}
}
