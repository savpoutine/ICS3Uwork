package cheung;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;

public class iSU {

	public static void main(String[] args) {
			EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);
			EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
			EV3TouchSensor touch = new EV3TouchSensor(SensorPort.S2);
			
			Stopwatch timer = new Stopwatch();		
			timer.reset();
			
			rightMotor.setSpeed(720);
			leftMotor.setSpeed(720);
			rightMotor.forward();
			leftMotor.forward();
			while (true) {
				if (ifPressed(touch)) {
					break;
				}
				System.out.println(timer.elapsed());
				if (timer.elapsed() >= 1000) {
					Sound.twoBeeps();
					Delay.msDelay(2000);
					timer.reset();
				}
				Delay.msDelay(50);			
			}
			
			Button.waitForAnyPress();
			
			//touchSensor(touch, leftMotor, rightMotor, time, starttime); 

		}
	public static boolean ifPressed(EV3TouchSensor touch) {

		float [] press = new float [1];
		touch.fetchSample(press,  0);
		Delay.msDelay(500);
		if (press [0]==0){
			return false;
		}
		else {
			return true;
		}
	}
		

	}


