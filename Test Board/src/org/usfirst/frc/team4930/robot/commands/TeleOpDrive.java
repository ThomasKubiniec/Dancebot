package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleOpDrive extends Command { {

		public TeleOpDrive() {
			requires(Robot.driveTrain);
		}

		protected void initialize() {
		}

		protected void execute() {
			Robot.driveTrain.takeJoystickInputs(-Robot.oi.joystick0.getY());
		}

		protected boolean isFinished() {
			return false;
		}

		protected void end() {
			Robot.driveTrain.stop();
		}

		protected void interrupted() {
			Robot.driveTrain.stop();
		}

	}

@Override
protected void initialize() {
	// TODO Auto-generated method stub
	
}

@Override
protected void execute() {
	// TODO Auto-generated method stub
	
}

@Override
protected boolean isFinished() {
	// TODO Auto-generated method stub
	return false;
}

@Override
protected void end() {
	// TODO Auto-generated method stub
	
}

@Override
protected void interrupted() {
	// TODO Auto-generated method stub
	
}
}
