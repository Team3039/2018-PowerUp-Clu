
package org.usfirst.frc.team3039.robot;

import org.usfirst.frc.team3039.robot.commands.GetCube;
import org.usfirst.frc.team3039.robot.commands.RaiseArm;
import org.usfirst.frc.team3039.robot.commands.ShootCube;
import org.usfirst.frc.team3039.robot.commands.ShootCubeSlow;

import com.team3039.util.PS4Copad;
import com.team3039.util.PS4Gamepad;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//Calls the Gamepad Classes: Defines gp and cp for the robot
	private PS4Gamepad gp = new PS4Gamepad(RobotMap.pilot);
	private PS4Copad cp = new PS4Copad(RobotMap.coPilot);
	
	//Returns Controller Data for use with certain Methods
	public PS4Gamepad getGamepad() {
		return gp;
	}
	
	public PS4Copad getCopad() {
		return cp;
	}
	
	//Creates a Button Object from the Controllers
	//Pilot
	Button buttonTriangle = gp.getButtonTriangle();
	Button buttonSquare = gp.getButtonSquare();
	Button buttonCircle = gp.getButtonCircle();
	Button buttonX = gp.getButtonX();
	Button buttonOptions = gp.getOptionsButton();
	Button buttonShare = gp.getShareButton();
	Button buttonStart = gp.getStartButton();
	Button buttonPad = gp.getButtonPad();
	Button L1 = gp.getL1();
	Button R1 = gp.getR1();
	Button L2 = gp.getL2();
	Button R2 = gp.getR2();
	Button L3 = gp.getL3();
	Button R3 = gp.getR3();
	
	
	//CoPilot
	Button cobuttonTriangle = cp.getButtonTriangle();
	Button cobuttonSquare = cp.getButtonSquare();
	Button cobuttonCircle = cp.getButtonCircle();
	Button cobuttonX = cp.getButtonX();
	Button cobuttonOptions = cp.getOptionsButton();
	Button cobuttonShare = cp.getShareButton();
	Button cobuttonPad = cp.getButtonPad();
	Button coL1 = cp.getL1();
	Button coR1 = cp.getR1();
	Button coL2 = cp.getL2();
	Button coR2 = cp.getR2();
	Button coL3 = cp.getL3();
	Button coR3 = cp.getR3();
	
//	public boolean toggleCoPilot = false;
//	
//	public void toggleCoPilotTrue() {
//		toggleCoPilot = true;
//	}
//	
//	public void toggleCoPilotFalse() {
//		toggleCoPilot = false;
//	}
	
	public OI() {
		
//		//Pilot Controls
//		L1.whileHeld(new ShootCubeSlow());
//		R1.whileHeld(new ShootCube());
				
//		L2.whileHeld(new GetCube());
		R2.whileHeld(new GetCube());
//		
//		buttonSquare.toggleWhenPressed(new RaiseArm());
//
//		
//		//CoPilot Controls
		
		coL1.whileHeld(new ShootCubeSlow());
		coR1.whileHeld(new ShootCube());
		
		cobuttonSquare.toggleWhenPressed(new RaiseArm());
		
		

	}	
}