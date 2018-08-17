package org.usfirst.frc.team3039.robot.subsystems;

import org.usfirst.frc.team3039.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lights extends Subsystem {

    public DigitalOutput armLedOne = new DigitalOutput(RobotMap.armLightInput1);
    public DigitalOutput armLedTwo = new DigitalOutput(RobotMap.armLightInput2);
    
    public static boolean red = true;
    public static boolean green = false;
    public static String color = "";
    
    public void setRedAsDefault(boolean redLights)
    {
    	red = redLights;
    }
    
    public void cubeGrabbed() {
    	armLedOne.set(true);
    	armLedTwo.set(false);
    	green = true;
    	color = "green";
    }
    
    public void armRaised() {
    	if(green == true) {
    		armLedOne.set(false);
        	armLedTwo.set(true);
        	color = "yellow";
    	}
    }

    public void defaultLights() {
    	if(red == true) {
    		armLedOne.set(false);
        	armLedTwo.set(false);
        	color = "red";
    	}
    	else {
    		armLedOne.set(true);
        	armLedTwo.set(true);
        	color = "blue";
    	}
    	green = false;
    }
    
    public boolean getLightOne() {
    	return armLedOne.get();
    }
    
    public boolean getLightTwo() {
    	return armLedTwo.get();
    }
    
    public String getColor() {
    	return color;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

