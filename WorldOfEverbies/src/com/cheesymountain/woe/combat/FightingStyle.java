package com.cheesymountain.woe.combat;

public class FightingStyle {
	
	private double StrengthModifier;
	private double staminaModifier;
	private double intelligenceModifier;
	
	public FightingStyle(double strengthModifier, double staminaModifier, double intelligenceModifier){
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
