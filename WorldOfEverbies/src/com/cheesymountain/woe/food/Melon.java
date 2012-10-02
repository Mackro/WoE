package com.cheesymountain.woe.food;

public class Melon extends Food {
	
	private static int cost = 0, fullnessModifier = 20, happinessModifier = 0, toxicityModifier = -5;

	public Melon() {
		super(cost, fullnessModifier, happinessModifier, toxicityModifier);
	}

	@Override
	public String getName() {
		return "Melon";
	}

}
