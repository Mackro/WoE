package com.cheesymountain.woe.enemies;

import com.cheesymountain.woe.item.*;

public class ScrapMetalTitan extends Enemy {
	
	private static final String NAME = "Scrapmetal titan";
	private static int HEALTH = 70;
	private static int STRENGTH = 14;
	private static int STAMINA = 14;
	private static int INTELLIGENCE = 8;
	private static int BASEMONEYREWARD = 40;
	
	public ScrapMetalTitan(){
		super(NAME, HEALTH, STRENGTH, STAMINA, INTELLIGENCE, BASEMONEYREWARD);
		super.setAdditionalItemReward(new Kettlebell());
	}
}