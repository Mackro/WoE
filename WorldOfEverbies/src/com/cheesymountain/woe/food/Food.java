package com.cheesymountain.woe.food;

public abstract class Food {
	
	private String name;
	private int cost;
	private int fullnessModifier, happinessModifier, toxicityModifier;
	
	public Food(String name, int cost, int fullnessModifier, int happinessModifier, int toxicityModifier){
		this.name = name;
		this.cost = cost;
		this.fullnessModifier = fullnessModifier;
		this.happinessModifier = happinessModifier;
		this.toxicityModifier = toxicityModifier;
	}
	
	public String getName(){
		return name;
	}
	
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
