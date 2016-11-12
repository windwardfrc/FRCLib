package org.frclibpkg;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class FRCLib{
	public static CANTalon frontLeft, frontRight, backLeft, backRight;
	public static Joystick joystick;
	private static int debugOutput = 0;
	public static void SmartDashboardPrint(String s){
		SmartDashboard.putString("String Output"+debugOutput, s);
		debugOutput++;
	}
	public static void AllMotorsSet(double s){
		backLeft.set(s);
		frontLeft.set(s);
		frontRight.set(s);
		backRight.set(s);
	}
	public static double GetStickRightVertical(){
		return joystick.getThrottle();
	}
	public static double GetStickLeftVertical(){
		return joystick.getY();
	}
}
