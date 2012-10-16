package com.cheesymountain.woe.race;

import com.cheesymountain.woe.R;

/**
 * A representation of the Skrom race.
 * Contains all the variables representing the starting values of the Skrom race.
 * @author Emil Åhsberg
 * @author Karl-Agnes 
 *
 */

public class Skrom extends Race{
	public Skrom(){
		name = "Skrom";
		description = "The most intelligent race among the Everbies" +
				" are the Skrom but their constant studying have resulted in severe obesity";
		imageID = R.drawable.skrom;
		maxHealthModifier = 20;
		strength = 1;
		intelligence = 3;
		stamina = 1;
		charm = 2;
		cuteness = 1;
	}
}