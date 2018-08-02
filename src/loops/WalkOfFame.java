
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot luka = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		luka.setX(400);
		luka.setY(800);
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.
		luka.setSpeed(10);
		luka.penDown();
		luka.setRandomPenColor();
		luka.setPenWidth(5);
		for (int j = 0; j < 15; j++) {
		for (int i = 0; i < 5; i++) {
			luka.move(30);
			luka.turn(144);
		}
		luka.penUp();
		luka.move(50);
		luka.penDown();
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
