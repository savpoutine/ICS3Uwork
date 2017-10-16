package cheung;

import java.util.Scanner;

/**
 * IfYourHappyAndYouKnowIt.java
 * This program prints if your happy and you know it lyrics
 * October 11, 2017
 * @author Naomi Cheung
 *
 */
public class IfYourHappyAndYouKnowIt {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String[] aArray= {"clap your hands", "jump around", "monkey around", "stomp your feet", "bake a cake", "hop around", "do a dance", "say horray", "brush your teeth", "wash your face", " go to bed"};
		//loops the lyrics to the song
		for (int i=0; i<aArray.length; i++) {
			System.out.println("If you're happy and you know it " + aArray[i]);
			System.out.println("If you're happy and you know it " + aArray[i]);
			System.out.println("If you're happy and you know it and you really want to show it");
			System.out.println("If you're happy and you know it " + aArray[i]);
		}
	}

}
