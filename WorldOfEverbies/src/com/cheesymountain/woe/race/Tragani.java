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
	
	public final String NAME = "Tragani";
	public final int IMAGEID = R.drawable.tragani;
	public final int MAXHEALTHMODIFIER = 20, STRENGTH = 1, INTELLIGENCE = 1, STAMINA  = 3,
			CHARM = 2, CUTENESS = 1;
	public final String DESCRIPTION = "The Traganis are know for their exceptional running speed and their total lack of common sense";
	public Tragani(){
		name = "Tragani";
		description = "The Traganis are know for their exceptional running speed" +
				"and their total lack of common sense";
		imageID = R.drawable.tragani;
		maxHealthModifier = 20;
		strength = 1;
		intelligence = 1;
		stamina  = 3;
		charm = 2;
		cuteness = 1;
	}
}