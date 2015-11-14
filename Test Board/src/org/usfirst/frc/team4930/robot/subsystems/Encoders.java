package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Encoders extends Subsystem {

	Encoder encoder01 = new Encoder(0,1,false,Encoder.EncodingType.k4X);

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}