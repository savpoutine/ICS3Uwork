package cheung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Probelm4.java 
 * This program solves problem 4-1 
 * September 22, 2017
 * @author Naomi Cheung
 *
 */
public class Probelm4 {

	public static void main(String[] args) {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
			
			try {
				
				System.out.print("Input a number to the burger you would like to order ");
				System.out.println("Cheeseburger=1, Fish burger=2, Veggie burger=3, No burger=4");		
				String burger1=in.readLine();
				int burger;
				burger=Integer.parseInt(burger1);
				int burgerCalorie=0;				
				System.out.print("Input a number to the drink of your choice ");
				System.out.println("Soft drink=1, Orange juice=2, Milk=3, and No drink=0"); 
				String drink1=in.readLine();
				int drink;
				drink=Integer.parseInt(drink1);
				int drinkCalorie=0;				
				System.out.print("input a number to the side of your choice ");
				System.out.println("Fries=1, Baked Potato=2, Chef Salad=3, No side=4");
				String side1=in.readLine();
				int side;
				side=Integer.parseInt(side1);
				int sideCalorie=0;
				System.out.print("Input a number to the dessert of your choice ");
				System.out.println("Apple Pie=1, Sundae=2, Fruit cup=3, No dessert=4");
				String dessert1=in.readLine();
				int dessert;
				dessert=Integer.parseInt(dessert1);
				int dessertCalorie=0;
				burger=Integer.parseInt(in.readLine());
				// sets a chosen burger to a calorie
				if (burger==1) {
					burgerCalorie =461;
				}
				else if (burger==2) {
					burgerCalorie=431;
				}
				else if (burger==3) {
					burgerCalorie=420;
				}		
				else if (burger==4) {
					burgerCalorie=0;
				}
				else {
					System.out.print("error");
				}				
				// sets a chosen drink to a calorie
				drink=Integer.parseInt(in.readLine());
				if (drink==1) {
					drinkCalorie=130;
				}
				else if (drink==2) {
					drinkCalorie=160;
				}
				else if (drink==3) {
					drinkCalorie=118;
				}
				else if (drink==4) {
					drinkCalorie=0;
				}
				else {
					System.out.print("error");
				}
				// sets the chosen side to a calorie
				side=Integer.parseInt(in.readLine());
				if (side==1) {
					sideCalorie=100;
				}
				else if (side==2) {
					sideCalorie=57;
				}
				else if (side==3) {
					sideCalorie=70;
				}
				else if (side==4) {
					sideCalorie=0;
				}
				else {
					System.out.print("error");
				}
				dessert=Integer.parseInt(in.readLine());
				// sets the chosen dessert to a calorie
				if (dessert==1) {
					dessertCalorie=167;
				}
				else if (dessert==2) {
					dessertCalorie=266;
				}
				else if (dessert==3) {
					dessertCalorie=75;
				}
				else if (dessert==4) {
					dessertCalorie=0;
				}
				else {
					System.out.print("error");
				}
				int calorie=0;
				// finds the calories of everything together 
				calorie = burgerCalorie + drinkCalorie + sideCalorie + dessertCalorie;
				System.out.print("Your total calorie count is " + calorie + ".");
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
					
	}

}
