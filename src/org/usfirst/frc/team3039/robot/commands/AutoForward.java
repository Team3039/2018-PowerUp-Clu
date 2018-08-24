package org.usfirst.frc.team3039.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoForward extends CommandGroup {

    public AutoForward() {
    	addSequential(new MoveForward(), 2);

    }
}
