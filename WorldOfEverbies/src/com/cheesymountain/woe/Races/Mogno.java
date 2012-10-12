package com.cheesymountain.woe.Races;

import com.cheesymountain.woe.R;

/**
 * A representation of the mogno race.
 * Contains all the different variables and skills that is specific for the mogno race,
 *  * @author Emil Åhsberg
 *
 */

public class Mogno extends Race {

	private static final String NAME = "Mogno";
	private static final String DESCRIPTION = "The mognos are known for their sharp claws and short temper";
	private static final int IMAGEID = R.drawable.mogno;
	private static final int MAXHEALTHMODIFIER = 20, HEALTH = 20, STRENGTH = 3, INTELLIGENCE = 1, STAMINA  = 2,
			CHARM = 1, CUTENESS = 1;
	
	public Mogno() {
		super(NAME, DESCRIPTION, IMAGEID, MAXHEALTHMODIFIER, HEALTH, STRENGTH, INTELLIGENCE, STAMINA,
				CHARM, CUTENESS);
		}

	
}
