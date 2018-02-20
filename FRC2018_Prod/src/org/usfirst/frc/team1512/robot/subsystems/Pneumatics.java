package org.usfirst.frc.team1512.robot.subsystems;
import org.usfirst.frc.team1512.robot.Robot;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class Pneumatics extends Robot {
	
	public void open () {
		if(xbox.getBumper(Hand.kRight) && grabberclosed==true) //if right bumper pressed and grabber is closed
		{
			
			while (xbox.getBumper(Hand.kRight))
			{
				//do nothing - wait until bumper is released before proceeding - stops double setting
			}
			
			grabber.set(false);	//open grabber
//			grabber.set(DoubleSolenoid.Value.kForward);	//open grabber
			grabberclosed=false;
		}
		}
		
	
	public void close () {
		if(xbox.getBumper(Hand.kRight) && grabberclosed==false) //if right bumper pressed and grabber is open
		{
			while (xbox.getBumper(Hand.kRight))
			{
				//do nothing - wait until bumper is released before proceeding - stops double setting
			}

//			grabber.set(DoubleSolenoid.Value.kReverse);	//close grabber
			grabber.set(true);	//close grabber
			grabberclosed=true;	
	}
	}
}
