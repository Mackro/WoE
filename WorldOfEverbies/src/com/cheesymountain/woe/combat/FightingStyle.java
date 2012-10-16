package com.cheesymountain.woe.combat;

public class FightingStyle {
	
	private int StrengthModifier;
	private int staminaModifier;
	private int intelligenceModifier;
	
	public FightingStyle(int strengthModifier, int staminaModifier, int intelligenceModifier){
		this.StrengthModifier = strengthModifier;
		this.staminaModifier = staminaModifier;
		this.intelligenceModifier = intelligenceModifier;
	}

	public int getStrengthModifier(){
		return StrengthModifier;
	}
	
	public int getStaminaModifier(){
		return staminaModifier;
	}
	
	public int getIntelligenceModifier(){
		return intelligenceModifier;
	}
}
