
package org.usfirst.frc.team3039.robot;

import org.usfirst.frc.team3039.robot.commands.AutoCenter;
import org.usfirst.frc.team3039.robot.commands.AutoForward;
import org.usfirst.frc.team3039.robot.commands.AutoLeft;
import org.usfirst.frc.team3039.robot.commands.AutoLeftOnly;
import org.usfirst.frc.team3039.robot.commands.AutoLeftSide;
import org.usfirst.frc.team3039.robot.commands.AutoRight;
import org.usfirst.frc.team3039.robot.commands.AutoRightOnly;
import org.usfirst.frc.team3039.robot.commands.AutoRightSide;
import org.usfirst.frc.team3039.robot.subsystems.Arm;
import org.usfirst.frc.team3039.robot.subsystems.Drivetrain;
import org.usfirst.frc.team3039.robot.subsystems.Intake;
import org.usfirst.frc.team3039.robot.subsystems.Lights;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoMode;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
	public static OI oi;
	public static final Drivetrain drivetrain = new Drivetrain();
	public static final Arm arm = new Arm();
	public static final Intake intake = new Intake();
	public static final Lights lights = new Lights();

	//Auto Setup
	Command autonomousCommand;
    SendableChooser<CommandGroup> chooser;
    
	static String gameInfo = "   " ;

	@Override
	public void robotInit() {
		setData("");
		drivetrain.motorSafety(false);
		arm.resetEncoder();
		oi = new OI();
		chooser = new SendableChooser<CommandGroup>();
	
		
		//Auto Chooser
		SmartDashboard.putData("Auto Mode", chooser);
		chooser.addDefault("Forward", new AutoForward());
		chooser.addObject("Center", new AutoCenter());
		chooser.addObject("Left", new AutoLeft());
		chooser.addObject("Right", new AutoRight());
		chooser.addObject("Left Only", new AutoLeftOnly());
		chooser.addObject("Right Only", new AutoRightOnly());
		chooser.addObject("Left Side", new AutoLeftSide());
		chooser.addObject("Right Side", new AutoRightSide());
		
		
		//Camera Setup
		UsbCamera usbCamera = CameraServer.getInstance().startAutomaticCapture();
		usbCamera.setVideoMode(VideoMode.PixelFormat.kYUYV, 640, 360, 60);
		usbCamera.setWhiteBalanceAuto();

		//Color Chooser
		SmartDashboard.putBoolean("Red Team", true);
	}
	
	@Override
	public void robotPeriodic() {
		setData(DriverStation.getInstance().getGameSpecificMessage());
		
	}

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		Robot.arm.resetEncoder();
	}

	
	public void setDefaultLights()
	{
		Robot.lights.setRedAsDefault(SmartDashboard.getBoolean("Red Team", true));
		
	}
	

	@Override
	public void autonomousInit() {
		setData(DriverStation.getInstance().getGameSpecificMessage());
		chooser.addDefault("Forward", new AutoForward());
		chooser.addObject("Center", new AutoCenter());
		chooser.addObject("Left", new AutoLeft());
		chooser.addObject("Right", new AutoRight());
		chooser.addObject("Left Only", new AutoLeftOnly());
		chooser.addObject("Right Only", new AutoRightOnly());
		chooser.addObject("Left Side", new AutoLeftSide());
		chooser.addObject("Right Side", new AutoRightSide());
		
		autonomousCommand = chooser.getSelected();

		if (autonomousCommand != null) {
			autonomousCommand.start();
		}
		setDefaultLights();
	}
	

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		setData(DriverStation.getInstance().getGameSpecificMessage());
		chooser.addDefault("Forward", new AutoForward());
		chooser.addObject("Center", new AutoCenter());
		chooser.addObject("Left", new AutoLeft());
		chooser.addObject("Right", new AutoRight());
		chooser.addObject("Left Only", new AutoLeftOnly());
		chooser.addObject("Right Only", new AutoRightOnly());
		chooser.addObject("Left Side", new AutoLeftSide());
		chooser.addObject("Right Side", new AutoRightSide());
	}

	@Override
	public void teleopInit() {
		Robot.arm.raiseArm();
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}
		setDefaultLights();
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		setDefaultLights();
		if(!Robot.lights.green)
			{
				Robot.lights.defaultLights();
			}
		System.out.println("Arm Piston :: " + Robot.arm.getArmPistion());
		System.out.println("Color :: " + Robot.lights.getColor());
		
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}


	public static String getData() {
			return gameInfo;
}

	public void setData(String newString) {
		gameInfo = newString;
	}
}
