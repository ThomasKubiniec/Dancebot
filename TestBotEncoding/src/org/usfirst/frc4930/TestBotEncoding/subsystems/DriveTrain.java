// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4930.TestBotEncoding.subsystems;


import org.usfirst.frc4930.TestBotEncoding.RobotMap;
import org.usfirst.frc4930.TestBotEncoding.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController motor3 = RobotMap.driveTrainMotor3;
    SpeedController motor4 = RobotMap.driveTrainMotor4;
    SpeedController motor1 = RobotMap.driveTrainMotor1;
    SpeedController motor2 = RobotMap.driveTrainMotor2;
    RobotDrive robotDrive = RobotMap.driveTrainRobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void initDefaultCommand() {
		setDefaultCommand(new Drive());
	}

	public void takeJoystickInputs(Joystick left, Joystick right) {
		robotDrive.tankDrive(-left.getY(), -right.getY());
	}

	public void runMotors(double left, double right) {
		robotDrive.tankDrive(-left, -right);
	}

	public void stop() {
		robotDrive.tankDrive(0, 0);
	}
}

