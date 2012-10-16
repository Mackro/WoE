package com.cheesymountain.woe.enemies;

public class OversizedSpider extends Enemy {
	
	private static final String NAME = "OversizedSpider";
	private static int HEALTH = 8;
	private static int STRENGTH = 2;
	private static int STAMINA = 2;
	private static int INTELLIGENCE = 1;
	private static int BASEMONEYREWARD = 10;
	
	public OversizedSpider(){
		super(NAME, HEALTH, STRENGTH, STAMINA, INTELLIGENCE, BASEMONEYREWARD);
	}
}