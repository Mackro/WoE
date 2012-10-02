package com.cheesymountain.woe.food;

public abstract class Food {
	
	private int cost;
	private int fullnessModifier, happinessModifier, toxicityModifier;
	
	public Food(int cost, int fullnessModifier, int happinessModifier, int toxicityModifier){
		this.cost = cost;
		this.fullnessModifier = fullnessModifier;
		this.happinessModifier = happinessModifier;
		this.toxicityModifier = toxicityModifier;
	}
	
	public abstract String getName();
	
	public int getCost(){
		return cost;
	}
	
	public int getFullnessModifier(){
		return fullnessModifier;
	}
	
	public int getHappinessModifier(){
		return happinessModifier;
	}
	
	public int getToxicityModifier(){
		return toxicityModifier;
	}

}
