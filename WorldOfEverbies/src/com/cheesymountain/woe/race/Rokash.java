package com.cheesymountain.woe.race;

import com.cheesymountain.woe.R;

/**
 * A representation of the Rokash race.
 * Contains all the variables representing the starting values of the Rokash race.
 * @author Emil Åhsberg
 * @author Karl-Agnes
 *
 */

public class Rokash extends Race {	
	public Rokash(){
		name = "Rokash";
		description = "the Rokash race is the cutest and most charming of all Everbies..." +
				"but also the most hostile";
		imageID = R.drawable.rokash;
		maxHealthModifier = 20;
		strength = 1;
		stamina  = 1;
		intelligence = 1;
		charm = 2;
		cuteness = 3;
	}
}
