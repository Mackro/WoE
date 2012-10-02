package com.cheesymountain.woe.food;

public class Melon extends Food {
	
	private static String name = "Melon";
	private static int cost = 0;
	private static int fullnessModifier = 20;
	private static int happinessModifier = 0;
	private static int toxicityModifier = -5;

	public Melon() {
		super(name, cost, fullnessModifier, happinessModifier, toxicityModifier);
		// TODO Auto-generated constructor stub
	}

}
