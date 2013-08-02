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
	SpaceObject.java
	 |
	 |--> Comet
	 |--> Ship
	 |--> Shot
*/



//package import
package comets;

public abstract class SpaceObject {
	
	//Class variables
	public static double playfieldHeight, playfieldWidth;
	protected double xVelocity, yVelocity, xPosition, yPosition, radius;
	
	//Class constructor
	public SpaceObject(double xPos, double yPos, 
					   double xVel, double yVel, double rad){
		xVelocity = xVel;
		yVelocity = yVel;
		xPosition = xPos;
		yPosition = yPos;
		radius = rad;
	}
	
	//return radius of the object
	public double getRadius(){
		return radius;
	}
	
	//return the x coordinate of the object
	public double getXPosition(){
		return xPosition;
	}
	
	//return the y coordinate of the object
	public double getYPosition(){
		return yPosition;
	}
	
	//update the x and y coordinates of the object
	//based on its velocity
	public void move(){
		//the new x, y coordinates
		double newX = xPosition+xVelocity;
		double newY = yPosition+yVelocity;
		
		//adjust for going off-screen
		if(newX > playfieldWidth) newX = 0;
		else if(newX < 0) newX = playfieldWidth;
		
		if(newY > playfieldHeight) newY = 0;
		else if(newY < 0) newY = playfieldHeight;
		
		//update the current position
		xPosition = newX;
		yPosition = newY;
	}
	
	//determine if two objects are overlapping (assumes objects are circular)
	public boolean overlapping(SpaceObject rhs){
		double distance = Math.sqrt(Math.pow((xPosition - rhs.xPosition), 2) + Math.pow((yPosition - rhs.yPosition), 2));
		if(distance < (radius + rhs.radius)) return true;
		return false;
	}
}
