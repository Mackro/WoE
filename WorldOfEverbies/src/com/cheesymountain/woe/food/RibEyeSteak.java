package com.cheesymountain.woe.food;

public class RibEyeSteak extends Food {

	private static int cost = 200, fullnessModifier = 100, happinessModifier = 30, toxicityModifier = 2;
	
	public RibEyeSteak() {
		super(cost, fullnessModifier, happinessModifier, toxicityModifier);
	}

	@Override
	public String getName() {
		return "Rib-Eye Steak";
	}

}
