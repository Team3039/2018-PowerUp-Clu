//package org.usfirst.frc.team3039.robot.commands;
//
//import org.usfirst.frc.team3039.robot.Robot;
//
//import edu.wpi.first.wpilibj.command.Command;
//
///**
// *
// */
//public class RotateArmThrottle extends Command {
//
//    public RotateArmThrottle() {
//    	requires(Robot.arm);
//        // Use requires() here to declare subsystem dependencies
//        // eg. requires(chassis);
//    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() {
//    	Robot.arm.rotateThrottle(Robot.oi.getCopad());
//    }
//
//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//        return false;
//    }
//
//    // Called once after isFinished returns true
//    protected void end() {
//    	Robot.arm.stopArm();
//    }
//
//    // Called when another command which requires one or more of the same
//    // subsystems is scheduled to run
//    protected void interrupted() {
//    	Robot.arm.stopArm();
//    }
//}
