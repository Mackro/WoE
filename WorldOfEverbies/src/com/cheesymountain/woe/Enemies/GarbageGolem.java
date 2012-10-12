package com.cheesymountain.woe.Enemies;

import com.cheesymountain.woe.item.HealthPotion;
import com.cheesymountain.woe.item.Item;

public class GarbageGolem extends Enemy {
	
	private static final String NAME = "Garbage golem";
	private static int HEALTH = 30;
	private static int STRENGTH = 6;
	private static int STAMINA = 1;
	private static int INTELLIGENCE = 1;
	private static int BASEMONEYREWARD = 5;
	private static Item additionalItemReward = new HealthPotion();
	
	public GarbageGolem(){
		super(NAME, HEALTH, STRENGTH, STAMINA, INTELLIGENCE, BASEMONEYREWARD);
		Enemy.setAdditionalItemReward(additionalItemReward);
	}
}