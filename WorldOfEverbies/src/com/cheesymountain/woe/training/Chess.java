package com.cheesymountain.woe.training;

public class Chess extends Training{
	
	private static String name = "chess";
	private static int strengthModifier = 0;
	private static int staminaModifier = 0;
	private static int intelligenceModifier = 2;
	private static int fullnessModifier = -3;

	public Chess() {
		super(strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier);

	}

	@Override
	public String getName() {

		return name;
	}

}
