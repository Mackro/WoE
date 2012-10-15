package com.cheesymountain.woe.Races;

import com.cheesymountain.woe.R;

/**
 * A representation of the Skrom race.
 * Contains all the variables representing the starting values of the Skrom race.
 * @author Emil Åhsberg
 * @author Karl-Agnes 
 *
 */

public class Skrom extends Race{

	public final String NAME = "Skrom";
	public final int IMAGEID = R.drawable.skrom;
	public final int MAXHEALTHMODIFIER = 20, HEALTH = 20, STRENGTH = 1,
			INTELLIGENCE = 3, STAMINA = 1, CHARM = 2, CUTENESS = 1;
	public final String DESCRIPTION = "The most intelligent race among the Everbies" +
			" are the Skrom but their constant studying have resulted in severe obesity";

}