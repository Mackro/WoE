package com.cheesymountain.woe.work;

public class MotelCleaning extends Work {

	private static String name = "MotelCleaning";
	private static int time = 5;
	private static int salary = 20;
	private static int happinessModifier = -15;
	private static int healthModifier = -2;
	
	public MotelCleaning() {
		super(name, time, salary, happinessModifier, healthModifier);
	}

}
