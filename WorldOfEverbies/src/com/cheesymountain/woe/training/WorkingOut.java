package com.cheesymountain.woe.training;

public class WorkingOut extends Training {

	private static String name = "working out";
	private static int strengthModifier = 2;
	private static int staminaModifier = 1;
	private static int intelligenceModifier = 0;
	private static int fullnessModifier = -4;
	
	public WorkingOut() {
		super(strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier);

	}

	@Override
	public String getName() {
		return name;
	}

}
