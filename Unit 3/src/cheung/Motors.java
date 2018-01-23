package cheung;

import javax.sound.sampled.Port;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Motors {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		leftMotor.setSpeed(720);
		rightMotor.setSpeed(720);
		leftMotor.forward();
		rightMotor.forward();
		Delay.msDelay(1000);
		leftMotor.stop();
		rightMotor.stop();
	}
	public static void square () {
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		for (int i=0; i<2; i++) {
			leftMotor.setSpeed(720);
			rightMotor.setSpeed(720);
			leftMotor.forward();
			rightMotor.forward();
			Delay.msDelay(1000);
			leftMotor.stop();
			rightMotor.rotate(260);
			Delay.msDelay(1000);
			rightMotor.stop();
		}	
		for (int i=0; i<2; i++) {
			leftMotor.setSpeed(720);
			rightMotor.setSpeed(720);
			leftMotor.forward();
			rightMotor.forward();
			Delay.msDelay(1000);
			leftMotor.stop();
			rightMotor.rotate(260);
			Delay.msDelay(1000);
			rightMotor.stop();

		}
	}
	public static void fwdSpin() {
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);

		leftMotor.setSpeed(720);
		rightMotor.setSpeed(720);
		leftMotor.forward();
		rightMotor.forward();
		Delay.msDelay(1000);
		leftMotor.stop();
		rightMotor.stop();

		for (int i=0; i<4; i++) {
			leftMotor.rotate(790, true);
			rightMotor.rotate(-790);
		}

		leftMotor.stop();
		rightMotor.stop();

		leftMotor.backward();
		rightMotor.backward();

		Delay.msDelay(1000);
		leftMotor.stop();
		rightMotor.stop();

	}
	public static void circle() {
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);

		leftMotor.setSpeed(720);
		rightMotor.setSpeed(360);
		for (int i=0; i<5; i++) {
			leftMotor.forward();
			rightMotor.rotate(790);
		}

	}
	/**
	 * @return distance
	 */
	public static void ultrasonicSensor() {
		EV3UltrasonicSensor ultra=new EV3UltrasonicSensor(SensorPort.S4);
		float [] distance = new float [1];
		ultra.enable();
		for (int i=0; i<distance.length; i++) {
			ultra.getDistanceMode();
			ultra.fetchSample(distance, i);
			System.out.println(distance[i]);
			Delay.msDelay(500);
		}
		ultra.disable();
		Button.waitForAnyPress();

	}
	public static void touchSensor() {
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);

		boolean press= ifPressed();
		for (int i=0; i<3; i++){
			leftMotor.setSpeed(720);
			rightMotor.setSpeed(720);
			leftMotor.forward();
			rightMotor.forward();
			while (press==false) {
				leftMotor.forward();
				rightMotor.forward();
				Delay.msDelay(5200);
				leftMotor.stop();
				rightMotor.stop();
			}
		}
		System.out.println(press);
		Button.waitForAnyPress();


	}
	public static boolean ifPressed() {
		EV3TouchSensor touch = new EV3TouchSensor(SensorPort.S2);
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
	public static void colourSensor() {
		EV3ColorSensor colour= new EV3ColorSensor(SensorPort.S3);
		float [] colourSample = new float [3];
		int counter=0;
		while (counter<4) {
			colour.setFloodlight(true);
			colour.getColorIDMode(). fetchSample(colourSample, 0);
			if (colourSample[0]==0) {
				System.out.println("Red");
			}
			else if (colourSample[0]==1) {
				System.out.println("Green");
			}
			else if (colourSample[0]==2) {
				System.out.println("Blue");
			}
			else if (colourSample[0]==3){
				System.out.println("Yellow");
			}
			Delay.msDelay(4000);
			counter++;
		}
		Button.waitForAnyPress();
	}
	
	public static void gyroSensor() {
		EV3GyroSensor gyro = new EV3GyroSensor (SensorPort. S1);
		float [] gyroSample = new float [1];
		gyro.getAngleMode().fetchSample(gyroSample, 0);
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		leftMotor.setSpeed(720);
		rightMotor.setSpeed(720);
		leftMotor.rotate(260);
		Delay.msDelay(4000);
		System.out.println(gyroSample[0]);
		Button.waitForAnyPress();
	}


}
