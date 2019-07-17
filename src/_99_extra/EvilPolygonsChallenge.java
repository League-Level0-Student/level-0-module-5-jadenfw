package _99_extra;
import java.awt.Color; 

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		rob.moveTo(0, 300);
		rob.turn(90);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"blue","red", "green","purple"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 1)
		{
			rob.setPenColor(100,0,0);
		}
		else if(colorChoice == 2)
		{
			rob.setPenColor(0,250,0);
		}
		else if(colorChoice == 3)
		{
			rob.setPenColor(0,0,250);
		}
		else if(colorChoice == 4)
		{
			rob.setPenColor(100,0,250);
		}
		//4. Ask the use how many polygons they want to be drawn.
		 String choice =JOptionPane.showInputDialog("how many polygons?");
		 int num = Integer.parseInt(choice);
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < num; i++) {
			rob.penDown();
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(90);
			rob.move(10);
			rob.turn(90);
			rob.penUp();
			rob.move(15);
			
		
		//6. Make it so your shapes do not overlap
		}
rob.hide();
		//7. Challenge: add more colors to the Option Dialog.
	}
}

