/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import robot.commands.JoystickCommand;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class ChassisSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public WPI_TalonSRX leftMotor = new WPI_TalonSRX(1);
	public WPI_TalonSRX rightMotor = new WPI_TalonSRX(2);
	
	public DifferentialDrive driveTrain = new DifferentialDrive(leftMotor, rightMotor);

	public void initDefaultCommand() {
		setDefaultCommand(new JoystickCommand());
	}
	
	public void move (double speed, double turn) {
		driveTrain.arcadeDrive(speed, turn);
	}
	
}
