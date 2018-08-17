package org.usfirst.frc.team3039.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCenter extends CommandGroup {

    public AutoCenter() {
    	String gameInfo;
    	gameInfo = DriverStation.getInstance().getGameSpecificMessage();
    	int count = 0;
           	while(count < 1000) {
    		count++;
    		gameInfo = DriverStation.getInstance().getGameSpecificMessage();
       	}
       	
       	try {
       		if(!gameInfo.equals(null)) {

    	if (gameInfo.charAt(0) == 'L' && gameInfo.charAt(1) == 'L') {
    		addSequential(new TurnLeftTank(), .75);
    		addSequential(new MoveForward(), .85);
    		addSequential(new TurnRightTank(), .7);
    	}
    	
    	else if (gameInfo.charAt(0) == 'R' && gameInfo.charAt(1) == 'L') {
    		addSequential(new TurnRightTank(), .75);
    		addSequential(new MoveForward(), .85);
    		addSequential(new TurnLeftTank(), .7);
    	}
    	
    	else if (gameInfo.charAt(0) == 'L' && gameInfo.charAt(1) == 'R') {
    		addSequential(new TurnLeftTank(), .75);
    		addSequential(new MoveForward(), .85);
    		addSequential(new TurnRightTank(), .7);

    	}
    	
    	else if (gameInfo.charAt(0) == 'R' && gameInfo.charAt(1) == 'R') {
    		addSequential(new TurnRightTank(), .75);
    		addSequential(new MoveForward(), .85);
    		addSequential(new TurnLeftTank(), .7);
    		addSequential(new TurnLeft());

    	}
   
    	else {
    		System.out.println("Drive Forward");
        	addSequential(new MoveForward(), 2);

    	}
    }
}
     
       	catch(Exception e) {
       		System.out.println("Drive Forward");
        	addSequential(new MoveForward(), 2);

       	}
    }
}


