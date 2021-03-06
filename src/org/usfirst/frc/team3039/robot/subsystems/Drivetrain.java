package org.usfirst.frc.team3039.robot.subsystems;

import org.usfirst.frc.team3039.robot.RobotMap;
import org.usfirst.frc.team3039.robot.commands.DriveTeleOp;

import com.team3039.util.PS4Gamepad;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {

	public Spark leftTopDriveMotor = new Spark(RobotMap.leftTopDriveMotor);
	public Spark leftBottomDriveMotor = new Spark(RobotMap.leftBottomDriveMotor);
	public Spark rightTopDriveMotor = new Spark(RobotMap.rightTopDriveMotor);
	public Spark rightBottomDriveMotor = new Spark(RobotMap.rightBottomDriveMotor);
	
	public SpeedControllerGroup leftDriveTrain = new SpeedControllerGroup(leftTopDriveMotor, leftBottomDriveMotor);
	public SpeedControllerGroup rightDriveTrain = new SpeedControllerGroup(rightTopDriveMotor, rightBottomDriveMotor);
	
	public DifferentialDrive drivetrain = new DifferentialDrive(rightDriveTrain, leftDriveTrain);
	
//	public Encoder driveEncoder = new Encoder(RobotMap.driveEncoderA, RobotMap.driveEncoderB);
	
	public void motorSafety(boolean enabled) {
		leftTopDriveMotor.setSafetyEnabled(enabled);
		leftBottomDriveMotor.setSafetyEnabled(enabled);
		rightTopDriveMotor.setSafetyEnabled(enabled);
		rightBottomDriveMotor.setSafetyEnabled(enabled);
	}
	
	public void driveTeleOp(PS4Gamepad gp) {
	    //Tele-Op Driving
	        drivetrain.arcadeDrive(gp.getLeftYAxis() * .95, gp.getRightXAxis() * .8);        
	    }
	
	public void driveForward() {
		leftTopDriveMotor.set(.85); 
		leftBottomDriveMotor.set(.85); 
		rightTopDriveMotor.set(-.85);
		rightBottomDriveMotor.set(-.85); 
	}
	
	public void driveBackward() {
		leftTopDriveMotor.set(-.85);
		leftBottomDriveMotor.set(-.85);
		rightTopDriveMotor.set(.85);
		rightBottomDriveMotor.set(.85);
	}
	
	public void turnRightTank() {
		leftTopDriveMotor.set(-.75);
		leftBottomDriveMotor.set(-.75);
		rightTopDriveMotor.set(0);
		rightBottomDriveMotor.set(0);
	}
	
	public void turnLeftTank() {
		leftTopDriveMotor.set(0);
		leftBottomDriveMotor.set(0);
		rightTopDriveMotor.set(-.75);
		rightBottomDriveMotor.set(-.75);
	}
	
	public void turnLeft() {
		leftTopDriveMotor.set(-.75);
		leftBottomDriveMotor.set(-.75);
		rightTopDriveMotor.set(.75);
		rightBottomDriveMotor.set(.75);
	}
	
	public void turnRight() {
		leftTopDriveMotor.set(.75);
		leftBottomDriveMotor.set(.75);
		rightTopDriveMotor.set(-.75);
		rightBottomDriveMotor.set(-.75);
	}
	
	public void stopDrive() {
		leftTopDriveMotor.set(0);
		leftBottomDriveMotor.set(0);
		rightTopDriveMotor.set(0);
		rightBottomDriveMotor.set(0);
	}
	
	
	

    
//    //Encoder 
//    public void setEncoder() {
//        //360 Pulses per Revolution
//        //6" Wheel has a Circumference of 18.85"
//    	//18.5/360 = x/1
//        driveEncoder.setDistancePerPulse(0.05235987755983);
//    }
//    
//    public double getDistance() {
//        return driveEncoder.getDistance();
//    }
//    
//    public double getRate() {
//    	return driveEncoder.getRate();
//    }
//    
//    public void resetEncoder() {
//        driveEncoder.reset();
//    }
    public void initDefaultCommand() {
        setDefaultCommand(new DriveTeleOp());
    }
}

