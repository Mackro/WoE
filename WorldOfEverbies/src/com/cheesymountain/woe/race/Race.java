package com.cheesymountain.woe.race;

import com.cheesymountain.woe.R;

public abstract class Race {
	
	private String NAME = "Eibreve";
	private String DESCRIPTION = "The plain Everbie without any boost, not choosable at the moment";
	private int IMAGEID = R.drawable.mogno;
	private int MAXHEALTHMODIFIER = 20, STRENGTH = 1, INTELLIGENCE = 1, STAMINA  = 1,
			CHARM = 1, CUTENESS = 1;
	public static final Race[] RACELIST = {new Mogno(), new Rokash(), new Skrom(), new Tragani()};

	public String getName() {
		return NAME;
	}
	public String getDescription() {
		return DESCRIPTION;
	}
	public int getImageID() {
		return IMAGEID;
	}
	public int getMaxHealthModifier() {
		return MAXHEALTHMODIFIER;
	}
	public int getStrength() {
		return STRENGTH;
	}
	public int getIntelligence() {
		return INTELLIGENCE;
	}
	public int getStamina() {
		return STAMINA;
	}
	public int getCharm() {
		return CHARM;
	}
	public int getCuteness() {
		return CUTENESS;
	}
}