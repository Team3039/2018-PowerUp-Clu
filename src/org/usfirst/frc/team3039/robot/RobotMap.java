/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3039.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int pilot = 0;
	public static final int coPilot = 1;
	
	//Drivetrain motors
	public static int leftTopDriveMotor = 2;
	public static int leftBottomDriveMotor = 3;
	public static int rightTopDriveMotor = 0;
	public static int rightBottomDriveMotor = 6;
	
	//Arm
	public static int armMotor = 12;
	
	//Intake
	public static int leftIntakeMotor = 4;
	public static int rightIntakeMotor = 5;
	
//DIO
	//Encoders
	public static int armEncoderA = 0;
	public static int armEncoderB = 1;
	
	//Limit Switches	//For Arm
	public static int maxForwardSwitch = 2;
	public static int maxBackSwitch = 3;
	public static int midSwitch = 4;
	
	// Pneumatics
	public static int armPiston = 0;
	
	// Lights
	public static int armLightInput1 = 0;
	public static int armLightInput2 = 1;
	
}
