package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	Robot[]roberts=new Robot[8];
	//2. create an array of 5 robots.
	for(int i = 0;i<roberts.length;i++) {
		roberts[i]=new Robot();
		roberts[i].setY(550);
		roberts[i].setX(i*100+50);
		roberts[i].setSpeed(10);
	}
	Random ran = new Random();
	//3. use a for loop to initialize the robots.
	Robot.setWindowColor(80,0,96);
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	for(int i = 0;i<roberts.length;i++) {
		roberts[i].move(ran.nextInt(99)+1);
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	boolean bool = false;
	int zeta = 0;
	while(!bool) {
		for(int i = 0;i<roberts.length;i++) {
			roberts[i].move(ran.nextInt(99)+1);
			if(roberts[i].getY()<0) {
				bool=true;
				System.out.println(bool);
				zeta=i;
				break;
			}
		}
	}
	//7. declare that robot the winner and throw it a party!
	for(int i =0;i<roberts.length;i++) {
		if(i!=zeta) {
			roberts[i].hide();
		}
	}
	roberts[zeta].sparkle();
	roberts[zeta].move(-100);
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
