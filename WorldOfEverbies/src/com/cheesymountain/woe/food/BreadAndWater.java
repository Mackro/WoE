package com.cheesymountain.woe.food;

public class BreadAndWater extends Food {
	
	private static String name = "Bread and Water";
	private static int cost = 0;
	private static int fullnessModifier = 10;
	private static int happinessModifier = -10;
	private static int toxicityModifier = 0;

	public BreadAndWater(){
		super(name, cost, fullnessModifier, happinessModifier, toxicityModifier);
	}
}
