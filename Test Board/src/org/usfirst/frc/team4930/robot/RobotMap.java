package org.usfirst.frc.team4930.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team4930.robot.commands.TeleOpDrive;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
	public static SpeedController driveTrainPWM0;
	public static RobotDrive driveTrain;
	public static Encoder encoder01;
	
	public Joystick joystick0;
	
	
	public static void init(){
	
		driveTrainPWM0 = new TalonSRX(0);
		LiveWindow.addActuator("DriveTrain", "PWM0", (TalonSRX) driveTrainPWM0);
		
	}
}
	
	// For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

