package com.cheesymountain.woe.training;


/**
 * @author Rickard Hallberg
 */
public class Squash extends Training{
	
	private static String name = "Squash";
	private static int strengthModifier = 1;
	private static int staminaModifier = 2;
	private static int intelligenceModifier = 0;
	private static int starvationModifier = -3;
	private static int minutesTraining = 50;
	
	public Squash() {
		super(strengthModifier, intelligenceModifier, staminaModifier, starvationModifier, minutesTraining);

	}

	@Override
	public String getName() {

		return name;
	}

}