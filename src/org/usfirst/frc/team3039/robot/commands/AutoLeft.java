package org.usfirst.frc.team3039.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoLeft extends CommandGroup {

    public AutoLeft() {
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
    		addSequential(new MoveForward(), 1.3);
    		addSequential(new ShootCube(), 1.5);
    	}
    	
    	else if (gameInfo.charAt(0) == 'R' && gameInfo.charAt(1) == 'L') {
//    		addSequential(new TurnRightTank(), 1.3);
//    		addSequential(new MoveForward(), .8);
//    		addSequential(new TurnLeftTank(), .95);
    		addSequential(new MoveForward(), .8);
    		addSequential(new TurnLeftTank(), .95);
    		addSequential(new MoveForward(), .4);
    		addSequential(new TurnRightTank(), .95);
    		addSequential(new MoveForward(), .4);
    	}
    	
    	else if (gameInfo.charAt(0) == 'L' && gameInfo.charAt(1) == 'R') {
    		addSequential(new MoveForward(), 1.3);
    		addSequential(new ShootCube(), 1.5);
    	}
    	
    	else if (gameInfo.charAt(0) == 'R' && gameInfo.charAt(1) == 'R') {
//    		addSequential(new TurnRightTank(), 1.3);
//    		addSequential(new MoveForward(), .8);
//    		addSequential(new TurnLeftTank(), .95);
    		addSequential(new MoveForward(), .8);
    		addSequential(new TurnLeftTank(), .95);
    		addSequential(new MoveForward(), .4);
    		addSequential(new TurnRightTank(), .95);
    		addSequential(new MoveForward(), .4);}
   
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