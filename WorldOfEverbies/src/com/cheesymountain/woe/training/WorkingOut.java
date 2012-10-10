package com.cheesymountain.woe.training;

/**
 * @author Rickard Hallberg
 */
public class WorkingOut extends Training {

	private static String name = "working out";
	private static int strengthModifier = 2;
	private static int staminaModifier = 1;
	private static int intelligenceModifier = 0;
	private static int fullnessModifier = -4;
	private static int minutesTraining = 90;
	
	public WorkingOut() {
		super(strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier, minutesTraining);

	}

	@Override
	public String getName() {
		return name;
	}

}
