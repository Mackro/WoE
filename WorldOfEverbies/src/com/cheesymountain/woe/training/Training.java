package com.cheesymountain.woe.training;

/**
 * This is an abstract class containing information for other classes that 
 * are to be treated as a training session. It has getters and a constructor.
 * 
 * @author Rickard Hallberg
 */
public abstract class Training {
	
	private int strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier, minutesTraining;
	
	/**
	 * This is the constructor that is called for from all subclasses.
	 * 
	 * @param strengthModifier
	 * @param intelligenceModifier
	 * @param staminaModifier
	 * @param fullnessModifier
	 */
	public Training(int strengthModifier, int intelligenceModifier, int staminaModifier, int fullnessModifier, int minutesTraining){
		this.fullnessModifier = fullnessModifier;
		this.intelligenceModifier = intelligenceModifier;
		this.staminaModifier = staminaModifier;
		this.strengthModifier = strengthModifier;
		this.minutesTraining = minutesTraining;
	}
	/**
	 * @return a string with the name of the type of training
	 */
	public abstract String getName();

	/**
	 * @return the strengthmodifier of the given training as an int
	 */
	public int getStrengthModifier(){
		return strengthModifier;
	}
	
	/**
	 * @return the intelligencemodifier of the given training as an int
	 */
	public int getIntelligenceModifier(){
		return intelligenceModifier;
	}
	
	/**
	 * @return the staminamodifier of the given training as an int
	 */
	public int getStaminaModifier(){
		return staminaModifier;
	}
	
	/**
	 * @return the fullnessmodifier of the given training as an int
	 */
	public int getFullnessModifier(){
		return fullnessModifier;
	}
	
	public int getMinutesTraining(){
		return minutesTraining;
	}
}
