package com.cheesymountain.woe.Races;

import com.cheesymountain.woe.R;

/**
 * A representation of the rokash race.
 * Contains all the different variables and skills that is specific for the rokash race,
 *  * @author Emil Åhsberg
 *
 */

public class Rokash extends Race {
	
	private static final String NAME = "Rokash";
	private static final int IMAGEID = R.drawable.rokash;
	private static final int MAXHEALTHMODIFIER = 20, HEALTH = 20, STRENGTH = 1, INTELLIGENCE = 1, STAMINA  = 1,
			CHARM = 2, CUTENESS = 3;
	private static final String DESCRIPTION = "the Rokash race is the cutest and most charming of all Everbies... but also the most hostile";
	
	public Rokash() {
		super(NAME, DESCRIPTION, IMAGEID, MAXHEALTHMODIFIER, HEALTH, STRENGTH, INTELLIGENCE, STAMINA,
				CHARM, CUTENESS);
		}

}
