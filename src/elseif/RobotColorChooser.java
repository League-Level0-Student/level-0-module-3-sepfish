//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot kaito = new Robot();
		kaito.penDown();
		kaito.hide();
		for (int j = 0; j < 5; j++) {
		kaito.sparkle();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("yellow")) {
			kaito.setPenColor(248, 252, 46);
		} else 
		if (color.equalsIgnoreCase("orange")) {
			kaito.setPenColor(250, 109, 0);
		} else
		if (color.equalsIgnoreCase("red")) {
			kaito.setPenColor(250, 0, 0);
		} else
		if (color.equalsIgnoreCase("green")) {
			kaito.setPenColor(25, 250, 23);
		} else
		if (color.equalsIgnoreCase("blue")) {
			kaito.setPenColor(13, 233, 255);
		} else
		if (color.equalsIgnoreCase("purple")) {
			kaito.setPenColor(132, 62, 255);
		} else {
        //6. If the user doesn’t enter anything, choose a random color
			JOptionPane.showMessageDialog(null, "...okay...");
			kaito.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		kaito.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		kaito.setSpeed(10);
		for (int i = 0; i < 12; i++) {
			kaito.move(150);
			kaito.turn(150);
		}
		}
		}
	}

