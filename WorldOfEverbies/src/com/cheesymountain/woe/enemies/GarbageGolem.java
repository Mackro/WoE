package com.cheesymountain.woe.enemies;

import com.cheesymountain.woe.item.HealthPotion;

public class GarbageGolem extends Enemy {
	
	private static final String NAME = "Garbage golem";
	private static int HEALTH = 30;
	private static int STRENGTH = 6;
	private static int STAMINA = 1;
	private static int INTELLIGENCE = 1;
	private static int BASEMONEYREWARD = 5;
	
	public GarbageGolem(){
		super(NAME, HEALTH, STRENGTH, STAMINA, INTELLIGENCE, BASEMONEYREWARD);
		super.setAdditionalItemReward(new HealthPotion());
	}
}