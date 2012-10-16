package com.cheesymountain.woe.race;

import com.cheesymountain.woe.R;

public abstract class Race {
	
	protected String name = "Eibreve";
	protected String description = "The plain Everbie without any boost, not choosable at the moment";
	protected int imageID = R.drawable.mogno;
	protected int maxHealthModifier = 20, strength = 1, intelligence = 1, stamina  = 1,
			charm = 1, cuteness = 1;
	public static final Race[] RACELIST = {new Mogno(), new Rokash(), new Skrom(), new Tragani()};

	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getImageID() {
		return imageID;
	}
	public int getMaxHealthModifier() {
		return maxHealthModifier;
	}
	public int getStrength() {
		return strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getStamina() {
		return stamina;
	}
	public int getCharm() {
		return charm;
	}
	public int getCuteness() {
		return cuteness;
	}
}