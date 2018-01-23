package cheung;


import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;

public class EV3ISU {
	/**
	 * java.EV3ISU
	 * This program is a running alarm clock for sleepy people
	 * January 16, 2018
	 * @param <EV3LargeRegulatedMotor>
	 * @param args
	 * @author Naomi Cheung
	 */
	public static  void main(String[] args) {


		EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
		EV3TouchSensor touch = new EV3TouchSensor(SensorPort.S2);
		EV3UltrasonicSensor ultra=new EV3UltrasonicSensor(SensorPort.S3);

		Stopwatch timer = new Stopwatch();		
		timer.reset();

		rightMotor.setSpeed(720);
		leftMotor.setSpeed(720);
		rightMotor.forward();
		leftMotor.forward();
		Sound.twoBeeps();
		Delay.msDelay(2000);
		ultrasonicSensor(ultra); 

		while (!ifPressed(touch)) {
			rightMotor.forward();
			leftMotor.forward();
			System.out.println("hold the touch sensor until it stops fully");
			if (timer.elapsed() >= 1000) {
				Sound.twoBeeps();
				Delay.msDelay(1000);
				timer.reset();
				//checks to see how far an object is, if it is too close, it will back up and rotate
				int measurement = ultrasonicSensor(ultra);
				if (measurement <= 0.10) {
					rightMotor.stop();
					leftMotor.stop();
					leftMotor.backward();
					rightMotor.rotate(260);
				}
			}
			Delay.msDelay(50);			
		}
		rightMotor.stop();
		leftMotor.stop();
		Button.waitForAnyPress();
	}



	/**
	 * java.ifPressed
	 * @param touch
	 * @return true or false
	 * 
	 */
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
	/**
	 * java.ultrasonicSensor 
	 * @param ultra
	 * @return distance 
	 */
	public static int ultrasonicSensor(EV3UltrasonicSensor ultra) {

		float[] distance = new float [1];
		ultra.enable();

		ultra.getDistanceMode();
		ultra.fetchSample(distance, 0);

		int d=(int) distance[0];
		return d;
	}


}
