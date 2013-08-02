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
	Ship.java
		- Fires shots
		- Collides with comets
*/



//package import
package comets;

public class Ship extends SpaceObject{

	//Class variables
	private double angle = 0;
	private double speed = 0;
	
	//Class constructor
	public Ship(double xPos, double yPos, double xVel, double yVel) {
		super(xPos, yPos, xVel, yVel, 10);
	}
	
	/*
	 * Accelerates the ship (forward)
	 */
	public void accelerate(){
		//formula for change in velocity
		double deltaxVel = 0.1 * Math.sin(angle);
		double deltayVel = 0.1 * Math.cos(angle);
		
		//add it to the current velocity
		xVelocity += deltaxVel;
		yVelocity += deltayVel;
		
		//calculate the speed
		speed += Math.sqrt(Math.pow(deltaxVel, 2) + Math.pow(deltayVel, 2));
		
		//adjust speed so it stays below 10
		if(speed > 10){		
			//formula to reduce velocity
			xVelocity *= 10/speed;
			yVelocity *= 10/speed;
			
			//calculate the new speed
			speed -= Math.sqrt(Math.pow(deltaxVel, 2) + Math.pow(deltayVel, 2));
		}
	}
	
	/*
	 * Decelerates the ship (reverse)
	 */
	public void decelerate(){
		//formula for change in velocity
		double deltaxVel = 0.1 * Math.sin(angle);
		double deltayVel = 0.1 * Math.cos(angle);
		
		//subtract it from the current velocity
		xVelocity -= deltaxVel;
		yVelocity -= deltayVel;
		
		//calculate the speed
		speed -= Math.sqrt(Math.pow(deltaxVel, 2) + Math.pow(deltayVel, 2));
		
		//adjust speed so it stays above -10
		if(speed < -10){
			//formula to reduce velocity
			xVelocity *= 10/speed;
			yVelocity *= 10/speed;
			
			//calculate the new speed
			speed += Math.sqrt(Math.pow(deltaxVel, 2) + Math.pow(deltayVel, 2));
		}
	}
	
	/*
	 * Fire a shot form the center of the ship
	 */
	public Shot fire(){
		//velocity of the shot
		double xVelS = 3.0 * Math.sin(angle) + xVelocity;
		double yVelS = 3.0 * Math.cos(angle) + yVelocity;
		
		//create a new shot
		Shot s = new Shot(xPosition, yPosition, xVelS, yVelS);
		
		
		return s;
	}
	
	/*
	 * Returns the angle of the ship
	 */
	public double getAngle(){
		return angle;
	}
	
	/*
	 * Rotate the ship left
	 */
	public void rotateLeft(){
		angle += 0.1;
	}
	
	/*
	 * Rotate the ship right
	 */
	public void rotateRight(){
		angle += -0.1;
	}

}
