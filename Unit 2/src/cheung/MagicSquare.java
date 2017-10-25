package cheung;


import java.io.IOException;

import java.util.Scanner;

public class MagicSquare {
	/**
	 * MagicSquare.java
	 * This program detects if all the numbers in a row and column are equal
	 * October 19, 2017
	 * @author Naomi Cheung
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner (System.in);
		int[][] grid= new int[4][4];
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				int square=sc.nextInt();
				grid [i][j]=square;
			}
		}
		
		int [] value={grid[0][0]+grid[1][0]+grid[2][0]+grid[3][0], grid[0][0]+grid[0][1]+grid[0][2]+grid[0][3], grid[1][0]+grid[1][1]+grid[1][2]+grid[1][3],grid[0][1]+grid[1][1]+grid[2][1]+grid[3][1],grid[0][2]+grid[1][2]+grid[2][2]+grid[3][2],grid[2][0]+grid[2][1]+grid[2][2]+grid[2][3],grid[0][3]+grid[1][3]+grid[2][3]+grid[3][3],grid[3][0]+grid[3][1]+grid[3][2]+grid[3][3]};

		if (value[0]==value[1] && value[0]==value[2]&&value[0]==value[3]&&value[0]==value[4]&&value[0]==value[5]&&value[0]==value[6]&&value[0]==value[7]){
			System.out.println("magic");
		}
		else {
			System.out.println("Not magic");
		}
	}
}
