package org.usfirst.frc.team3039.robot.subsystems;

import org.usfirst.frc.team3039.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {


	public Talon leftIntakeMotor = new Talon(RobotMap.leftIntakeMotor);
	public Talon rightIntakeMotor = new Talon(RobotMap.rightIntakeMotor);


	//Intake
	public void motorSafety(boolean enabled) {
		leftIntakeMotor.setSafetyEnabled(enabled);
		rightIntakeMotor.setSafetyEnabled(enabled);
	}
	
		public void getCube() {
			leftIntakeMotor.set(-.40);
			rightIntakeMotor.set(.40);
		}
		
		public void shootCube() {
			leftIntakeMotor.set(.90);
			rightIntakeMotor.set(-.90);
		}
		
		public void shootCubeSlow() {
			leftIntakeMotor.set(.50);
			rightIntakeMotor.set(-.50);
		}
		public void stopCube() {
			leftIntakeMotor.set(0);
			rightIntakeMotor.set(0);
		}
		
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

