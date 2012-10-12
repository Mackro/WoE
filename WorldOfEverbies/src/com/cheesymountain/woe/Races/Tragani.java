package com.cheesymountain.woe.Races;

import com.cheesymountain.woe.R;

/**
 * A representation of the Tragani race.
 * Contains all the different variables and skills that is specific for the Tragani race,
 *  * @author Emil Åhsberg
 *
 */

public class Tragani extends Race {
	
	private static final String NAME = "Tragani";
	private static final int IMAGEID = R.drawable.tragani;
	private static final int MAXHEALTHMODIFIER = 20, HEALTH = 20, STRENGTH = 1, INTELLIGENCE = 1, STAMINA  = 3,
			CHARM = 2, CUTENESS = 1;
	private static final String DESCRIPTION = "The Traganis are know for their exceptional running speed and their total lack of common sense";
	
	public Tragani() {
		super(NAME, DESCRIPTION, IMAGEID, MAXHEALTHMODIFIER, HEALTH, STRENGTH, INTELLIGENCE, STAMINA,
				CHARM, CUTENESS);
		}

}