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
//    		addSequential(new TurnLeftTank(), .75);
//    		addSequential(new MoveForward(), .85);
//    		addSequential(new TurnRightTank(), .7);
//    		addSequential(new DropArm(), 2);
//    		addSequential(new RaiseArm(), 2);
//    		addSequential(new DelayMovement(), 1.5);
    		addSequential(new MoveForward(), .25);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new TurnLeftTank(), 1.4);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new MoveForward(), .55);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new TurnRightTank(), 1.4);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new MoveForward(), .25);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new ShootCubeSlow(), 1.5);
    	}
    	
    	else if (gameInfo.charAt(0) == 'R' && gameInfo.charAt(1) == 'L') {
//    		addSequential(new TurnRightTank(), .75);
//    		addSequential(new MoveForward(), .85);
//    		addSequential(new TurnLeftTank(), .7);
//    		addSequential(new DropArm(), 2);
//    		addSequential(new RaiseArm(), 2);
//    		addSequential(new DelayMovement(), 1.5);
    		addSequential(new MoveForward(), .25);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new TurnRightTank(), 1.4);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new MoveForward(), .55);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new TurnLeftTank(), 1.4);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new MoveForward(), .25);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new ShootCubeSlow(), 1.5);
    	}
    	
    	else if (gameInfo.charAt(0) == 'L' && gameInfo.charAt(1) == 'R') {
//    		addSequential(new TurnLeftTank(), .75);
//    		addSequential(new MoveForward(), .85);
//    		addSequential(new TurnRightTank(), .7);
    		addSequential(new MoveForward(), .25);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new TurnLeftTank(), 1.4);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new MoveForward(), .55);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new TurnRightTank(), 1.4);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new MoveForward(), .25);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new ShootCubeSlow(), 1.5);

    	}
    	
    	else if (gameInfo.charAt(0) == 'R' && gameInfo.charAt(1) == 'R') {
//    		addSequential(new TurnRightTank(), .75);
//    		addSequential(new MoveForward(), .85);
//    		addSequential(new TurnLeftTank(), .7);
//    		addSequential(new DropArm(), 2);
//    		addSequential(new RaiseArm(), 2);
//    		addSequential(new DelayMovement(), 1.5);
    		addSequential(new MoveForward(), .25);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new TurnRightTank(), 1.4);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new MoveForward(), .55);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new TurnLeftTank(), 1.4);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new MoveForward(), .25);
    		addSequential(new DelayMovement(), .2);
    		addSequential(new ShootCubeSlow(), 1.5);

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


