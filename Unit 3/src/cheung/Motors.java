package cheung;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Motors {

	public static void main(String[] args) {
	
		fwdSpin();

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
		leftMotor.rotate(720, true);
		rightMotor.rotate(-720);
		}
		
		leftMotor.stop();
		rightMotor.stop();
		
		leftMotor.backward();
		rightMotor.backward();
		
		Delay.msDelay(1000);
		leftMotor.stop();
		rightMotor.stop();
		
	}

}