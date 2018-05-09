/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package robot.oi;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	GameController joystick = new XBoxGameController(0);
	
	public double getSpeed () {
		return joystick.getLeftYAxis();
	}
	
	public double getTurn () {
		return -joystick.getRightXAxis();
	}
	
}
