package com.cheesymountain.woe.training;

/**
 * @author Rickard Hallberg
 */
public class Swimming extends Training{
	
	private static String name = "Swimming";
	private static int strengthModifier = 1;
	private static int staminaModifier = 3;
	private static int intelligenceModifier = 0;
	private static int starvationModifier = -3;
	private static int minutesTraining = 90;
	
	public Swimming() {
		super(strengthModifier, intelligenceModifier, staminaModifier, starvationModifier, minutesTraining);

	}

	@Override
	public String getName() {

		return name;
	}

}
