package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot VY2;
	public static void main(String[] args) {
		ObedientRobot KYO = new ObedientRobot();
		VY2 = new Robot();
		VY2.hide();
		VY2.penDown();
		VY2.setSpeed(20);
		String color = JOptionPane.showInputDialog("What color would you like?");
		if (color.equalsIgnoreCase("yellow")) {
			VY2.setPenColor(248, 252, 46);
		} else 
		if (color.equalsIgnoreCase("orange")) {
			VY2.setPenColor(250, 109, 0);
		} else
		if (color.equalsIgnoreCase("red")) {
			VY2.setPenColor(250, 0, 0);
		} else
		if (color.equalsIgnoreCase("green")) {
			VY2.setPenColor(25, 250, 23);
		} else
		if (color.equalsIgnoreCase("blue")) {
			VY2.setPenColor(13, 233, 255);
		} else
		if (color.equalsIgnoreCase("purple")) {
			VY2.setPenColor(132, 62, 255);
		} else
		if (color.equalsIgnoreCase("glitterbeige")) {
			VY2.sparkle();
			VY2.setPenColor(211, 194, 132);
		} else {
			JOptionPane.showMessageDialog(null, "I don't know what that color is...");
			VY2.setRandomPenColor();
		}
		String shape = JOptionPane.showInputDialog("What shape do you want? Square, triangle, or circle?");
		if (shape.equalsIgnoreCase("square")) {
			KYO.drawSquare();
		} else 
		if (shape.equalsIgnoreCase("triangle")){
			KYO.drawTriangle();
		} else
		if (shape.equalsIgnoreCase("circle")) {
			KYO.drawCircle();
		} else {
			JOptionPane.showMessageDialog(null, "Fine, I'll pick for you.");
			KYO.drawSquare();
		}
		
		
	}
	public void drawSquare() {
		for (int i = 0; i < 4; i++) {
			VY2.move(200);
			VY2.turn(90);
		}
		}
	public void drawTriangle() {
		for (int j = 0; j < 3; j++) {
			VY2.move(200);
			VY2.turn(120);
		}
	}
	public void drawCircle() {
		for (int k = 0; k < 36; k++) {
			VY2.move(20);
			VY2.turn(10);
		}
	}

}
