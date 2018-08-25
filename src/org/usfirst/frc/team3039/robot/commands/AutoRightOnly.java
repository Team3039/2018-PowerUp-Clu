package org.usfirst.frc.team3039.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;
/**
 *
 */
public class AutoRightOnly extends CommandGroup {

	public AutoRightOnly() {
    	String gameInfo;
    	gameInfo = DriverStation.getInstance().getGameSpecificMessage();
    	int count = 0;
           	while(count < 1000) {
    		count++;
    		gameInfo = DriverStation.getInstance().getGameSpecificMessage();
       	}
       	
       	try {
       		if(!gameInfo.equals(null)) {

       			
       			
    	if (gameInfo.charAt(0) == 'L') {
    		addSequential(new MoveForward(), 1.1);
    	}
    	
    	else if (gameInfo.charAt(0) == 'R') {
    		addSequential(new MoveForward(), 1.05);
    		addSequential(new ShootCubeSlow(), 1.5);
    	}
    	
   
    	else {
    		System.out.println("Drive Forward");
    		addSequential(new MoveForward(), 1.1);

    	}
    }
}
     
       	catch(Exception e) {
       		System.out.println("Drive Forward");
       		addSequential(new MoveForward(), 1.1);

       	}
    }
}