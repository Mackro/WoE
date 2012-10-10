package com.cheesymountain.woe.training;

/**
 * @author Rickard Hallberg
 */
public class Chess extends Training{
	
	private static String name = "chess";
	private static int strengthModifier = 0;
	private static int staminaModifier = 0;
	private static int intelligenceModifier = 2;
	private static int fullnessModifier = -3;
	private static int minutesTraining = 50;
	
	public Chess() {
		super(strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier, minutesTraining);

	}

	@Override
	public String getName() {

		return name;
	}

}
