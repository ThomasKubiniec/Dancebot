package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.TeleOpDrive;



import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	
	
		SpeedController pWM0 = RobotMap.driveTrainPWM0;
			
		public void initDefaultCommand1(){
			setDefaultCommand(new TeleOpDrive());
		}

		public void stop() {
			robotDrive.tankDrive(0, 0);
		}
		

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}


		
}


