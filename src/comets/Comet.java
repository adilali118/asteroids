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
	Comet.java
	 |
	 |--> LargeComet
	 |--> MediumComet
	 |--> SmallComet
*/



//package import
package comets;

public abstract class Comet extends SpaceObject {

	//Class constructor
	public Comet(double xPos, double yPos, 
			     double xVel, double yVel, double rad) {
		super(xPos, yPos, xVel, yVel, rad);
	}
	
	/*
	 * Abstract method; every comet will be exploded upon collision
	 */
	public abstract java.util.Vector<Comet> explode();
}
