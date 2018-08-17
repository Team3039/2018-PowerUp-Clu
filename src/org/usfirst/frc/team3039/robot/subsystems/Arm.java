package org.usfirst.frc.team3039.robot.subsystems;

import org.usfirst.frc.team3039.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
	public Encoder armEncoder = new Encoder(RobotMap.armEncoderA, RobotMap.armEncoderB);
	
	public Solenoid armPiston = new Solenoid(RobotMap.armPiston);
	
	public boolean maxBackward;
	public boolean maxForward;
	
		// Encoders
	    public double getDistance() {
	    	return armEncoder.getDistance();
	    }
  
	    public double getRate() {
	    	return armEncoder.getRate();
	    }
	    
	    public void resetEncoder() {
	    	armEncoder.reset();
	    }
	    
	    // Pneumatics
	    public void raiseArm() {
	    	armPiston.set(false);
	    }
	    
	    public void dropArm() {
	    	armPiston.set(true);
	    }
	    
	    public void stopArmPneumatics() {
	    	armPiston.set(true);
	    }
	    
	    public boolean getArmPistion() {
	    	return armPiston.get();
	    }
	    

	
	@Override
	protected void initDefaultCommand() {
//		setDefaultCommand(new RotateArmThrottle());
	}
	
}
