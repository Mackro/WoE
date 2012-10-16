package com.cheesymountain.woe.Races;

import com.cheesymountain.woe.R;

public abstract class Race {
	public final String NAME = "Eibreve";
	public final String DESCRIPTION = "The plain Everbie without any boost, not choosable at the moment";
	public final int IMAGEID = R.drawable.mogno;
	public final int MAXHEALTHMODIFIER = 20, HEALTH = 20, STRENGTH = 1, INTELLIGENCE = 1, STAMINA  = 1,
			CHARM = 1, CUTENESS = 1;
	public static final Race[] RACELIST = {new Mogno(), new Rokash(), new Skrom(), new Tragani()};
}