package com.cheesymountain.woe.race;

import com.cheesymountain.woe.R;

/**
 * A representation of the Tragani race.
 * Contains all the variables representing the starting values of the Tragani race.
 * @author Emil Åhsberg
 * @author Karl-Agnes
 *
 */

public class Tragani extends Race{

	public Tragani(){
		name = "Tragani";
		description = "The Traganis are know for their exceptional running speed" +
				"and their total lack of common sense";
		imageID = R.drawable.tragani;
		maxHealthModifier = 20;
		strength = 1;
		intelligence = 1;
		stamina  = 3;
		charm = 3;
		cuteness = 1;
	}
}