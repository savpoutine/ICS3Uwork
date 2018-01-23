package cheung;

import lejos.hardware.Button;
import lejos.hardware.Key;
import lejos.hardware.Sound;
import lejos.utility.Delay;

public class HelloWorld {

	public static void main(String[] args) {
		int c=1;
		while (c==1) {
			switch(Button.readButtons()) {
			case Button.ID_DOWN:
				HappyBirthday();
				break;
			case Button.ID_LEFT:
				Sound.buzz();
				break;
			case Button.ID_RIGHT:
				Sound.twoBeeps();
				break;
			case Button.ID_UP:
				break;
			case Button.ID_ESCAPE:
				c=0;
				break;
			}
		}
	}
	public static void HappyBirthday() {
		Sound.playTone(262, 250);
		Sound.playTone(262, 250);
		Sound.playTone(294, 500); 
		Sound.playTone(262, 500);
		Sound.playTone(349, 500);
		Sound.playTone(330, 1000);
		Sound.playTone(262, 250);
		Sound.playTone(262, 250);
		Sound.playTone(294, 500);
		Sound.playTone(262, 500);
		Sound.playTone(394, 500);
		Sound.playTone(349, 1000);
		Sound.playTone(262, 250);
		Sound.playTone(262, 250);
		Sound.playTone(523, 500);
		Sound.playTone(440, 500);
		Sound.playTone(349, 500);
		Sound.playTone(330, 500);
		Sound.playTone(294, 500);
		Sound.playTone(466, 250);
		Sound.playTone(466, 250);
		Sound.playTone(440, 500);
		Sound.playTone(349, 500);
		Sound.playTone(392, 500);
		Sound.playTone(349, 1000);
	}



}
