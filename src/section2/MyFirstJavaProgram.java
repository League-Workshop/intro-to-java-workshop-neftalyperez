package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot R2_D2=new Robot();
		R2_D2.changeRobot("https://sm.ign.com/ign_ap/news/s/stan-lee-d/stan-lee-drops-big-hero-6-sequel-news_hkmy.jpg");
		R2_D2.penDown();
		int sides=1000;
	    int angle=360/sides;
		for(int i=0;i<sides;i++) {
			R2_D2.move(100);
		R2_D2.turn(10);
		R2_D2.setSpeed(10);
		}
	}
}
