package com.cheesymountain.woe.Enemies;

public class GardenGnome extends Enemy {
	
	private static final String NAME = "Garden gnome";
	private static int HEALTH = 3;
	private static int STRENGTH = 1;
	private static int STAMINA = 1;
	private static int INTELLIGENCE = 1;
	private static int BASEMONEYREWARD = 5;
	
	public GardenGnome(){
		super(NAME, HEALTH, STRENGTH, STAMINA, INTELLIGENCE, BASEMONEYREWARD);
	}
}
