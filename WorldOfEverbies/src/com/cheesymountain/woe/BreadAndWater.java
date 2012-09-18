package com.cheesymountain.woe;

public class BreadAndWater extends Food {

	private String name = "Bread and Water";
	private int cost = 0;
	private int fullnessModifier = 20;
	private int happinessModifier = -10;
	
	public String getName(){
		return name;
	}
	public int getCost() {
		return cost;
	}

	public int getFullnessModifier() {
		return fullnessModifier;
	}

}
