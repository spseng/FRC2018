package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class toggleSolenoid3 extends Command {
	OI oi;
	
    public toggleSolenoid3() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.solenoid3);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	oi = new OI();
    	if(oi.solenoid3State()) {
    		Robot.solenoid3.in();
    	}
    	else {
    		Robot.solenoid3.out();
    	}
       }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    		return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.solenoid3.out();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	// precautionary
    	end();
    }
}