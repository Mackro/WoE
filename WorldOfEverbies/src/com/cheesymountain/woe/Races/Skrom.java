package com.cheesymountain.woe.Races;

import com.cheesymountain.woe.R;

/**
 * A representation of the rokash race.
 * Contains all the different variables and skills that is specific for the rokash race,
 *  * @author Emil Åhsberg
 *
 */

public class Skrom extends Race {

	private static final String NAME = "Skrom";
	private static final int IMAGEID = R.drawable.skrom;
	private static final int MAXHEALTHMODIFIER = 20, HEALTH = 20, STRENGTH = 1,
			INTELLIGENCE = 3, STAMINA = 1, CHARM = 2, CUTENESS = 1;
	private static final String DESCRIPTION = "The most intelligent race among the Everbies" +
			" are the Skrom but their constant studying have resulted in severe obesity";

	public Skrom() {
		super(NAME, DESCRIPTION, IMAGEID, MAXHEALTHMODIFIER, HEALTH, STRENGTH,
				INTELLIGENCE, STAMINA, CHARM, CUTENESS);
	}

}