package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot jenieva= new Robot("batman");

	void go() {
		// 4. Make the robot move as fast as possible
jenieva.setSpeed(10);
		// 5. Set the pen width to 5
jenieva.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		jenieva.penDown();
		jenieva.setSpeed(6);
		jenieva.setRandomPenColor();
		jenieva.setPenWidth(100);
		for (int i = 0; i < 4; i++) {
			jenieva.move(200);
			jenieva.turn(90);
		}
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
