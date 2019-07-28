package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	public static void main(String[] args) {
		
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot r2d2 = new Robot();
		//2. Set the speed to 100
r2d2.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0){
			r2d2.setPenColor(0,0,0);
		}
		else if(colorChoice==1){
			r2d2.setPenColor(255,255,255);
		}
		else if(colorChoice==2) {
			r2d2.setPenColor(255,0,0);
			
		}
		//4. Ask the use how many polygons they want to be drawn.
		String x=JOptionPane.showInputDialog("How many Polygons do you wann draw?");
		Integer.parseInt(x);
		//int y = x ;
		//5. Use the robot to draw the number of polygons the user requested.
			r2d2.penDown();
for (int i = 0; i < 1; i++) {
			r2d2.move(20);
			r2d2.turn(120);
			r2d2.move(20);
			r2d2.turn(120);
			r2d2.move(20);
			r2d2.turn(120);
			r2d2.move(20);
			r2d2.turn(120);
			r2d2.move(20);
			r2d2.turn(120);
			r2d2.move(20);
			r2d2.turn(120);
		}
			
		//7. Challenge: add more colors to the Option Dialog.	
		
		//6.Optional: Make it so your shapes do not overlap
	}
}
}

