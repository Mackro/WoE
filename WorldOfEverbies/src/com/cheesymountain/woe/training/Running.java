package com.cheesymountain.woe.training;

/**
 * @author Rickard Hallberg
 */
public class Running extends Training {
	
	private static String name = "running";
	private static int strengthModifier = 0;
	private static int staminaModifier = 2;
	private static int intelligenceModifier = 0;
	private static int fullnessModifier = -2;
	private static int minutesTraining = 45;

	public Running() {
		
		super(strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier, minutesTraining);
		
	}

	@Override
	public String getName() {
		return name;
	}

}
