package com.cheesymountain.woe.training;

public abstract class Training {
	
	private int strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier;
	
	public Training(int strengthModifier, int intelligenceModifier, int staminaModifier, int fullnessModifier){
		this.fullnessModifier = fullnessModifier;
		this.intelligenceModifier = intelligenceModifier;
		this.staminaModifier = staminaModifier;
		this.strengthModifier = strengthModifier;
	}
	
	public abstract String getName();

	
	public int getStrengthModifier(){
		return strengthModifier;
	}
	
	public int getIntelligenceModifier(){
		return intelligenceModifier;
	}
	
	public int getStaminaModifier(){
		return staminaModifier;
	}
	
	public int getFullnessModifier(){
		return fullnessModifier;
	}
}
