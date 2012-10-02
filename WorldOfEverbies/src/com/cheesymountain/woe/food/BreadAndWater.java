package com.cheesymountain.woe.food;

public class BreadAndWater extends Food {
	
	private static int cost = 0;
	private static int fullnessModifier = 10;
	private static int happinessModifier = -10;
	private static int toxicityModifier = 0;

	public BreadAndWater(){
		super(cost, fullnessModifier, happinessModifier, toxicityModifier);
	}

	@Override
	public String getName() {
		return "Bread and Water";
	}
}
