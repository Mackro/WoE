package com.cheesymountain.woe.race;

import com.cheesymountain.woe.R;

/**
 * A representation of the Mogno race.
 * Contains all the variables representing the starting values of the Mogno race.
 *  @author Emil Åhsberg
 *  @author Karl-Agnes
 *
 */

public class Mogno extends Race {
	public Mogno(){
		name = "Mogno";
		description = "The mognos are known for their sharp claws and short temper";
		imageID = R.drawable.mogno;
		maxHealthModifier = 20;
		strength = 3;
		intelligence = 1;
		stamina  = 2;
		charm = 1;
		cuteness = 1;
	}
}
