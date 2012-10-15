package com.cheesymountain.woe.Combat;

public class FightingStyle {
	
	private double StrengthModifier;
	private double staminaModifier;
	private double intelligenceModifier;
	
	public FightingStyle(int strengthModifier, int staminaModifier, int intelligenceModifier){
		this.StrengthModifier = strengthModifier;
		this.staminaModifier = staminaModifier;
		this.intelligenceModifier = intelligenceModifier;
	}

	public double getStrengthModifier(){
		return StrengthModifier;
	}
	
	public double getStaminaModifier(){
		return staminaModifier;
	}
	
	public double getIntelligenceModifier(){
		return intelligenceModifier;
	}
}
