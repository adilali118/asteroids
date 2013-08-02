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
	SmallComet.java
		- Comet with radius of 20
		- Smallest in hierarchy
*/


//package import
package comets;
//standard Java import
import java.util.*;

public class SmallComet extends Comet{

	//Class constructor
	public SmallComet(double xPos, double yPos, 
					  double xVel, double yVel) {
		super(xPos, yPos, xVel, yVel, 20);
	}
	
	public java.util.Vector<Comet> explode(){
		//small comet doesn't spawn any children
		return new Vector();
	}
}
