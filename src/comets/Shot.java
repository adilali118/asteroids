/*
	Isabella Moreira
	July 24, 2013
	COP 3330: Professor Eisler
	
	Description
	===========
	Classic Asteroids game with GUI interface
	
	Includes:
		- Sound effects
		- Scoring mechanism
		- Multiple levels with easy additional configurations
		
	File
	====
	Shot.java
		- Shot from center of ship
		- Destroys comets
*/


//package import
package comets;

public class Shot extends SpaceObject{
	
	//Class variables
	public int age;		//how many frames the shot has been on screen for
	
	//Class constructor
	public Shot(double xPos, double yPos, double xVel, double yVel) {
		super(xPos, yPos, xVel, yVel, 3);
	}
	
	/*
	 * Returns the age of the shot
	 */
	public int getAge(){
		return age;
	}
	
	/*
	 * Increment the age of the shot per frame
	 */
	public void move(){
		super.move();
		age++;
	}

}
