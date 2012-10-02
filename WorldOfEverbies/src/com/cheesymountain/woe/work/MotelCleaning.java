package com.cheesymountain.woe.work;
/**
 * @author Karl-Agnes
 */
public class MotelCleaning extends Work {

	private static int time = 5;
	private static int salary = 20;
	private static int happinessModifier = -15;
	private static int healthModifier = -2;
	
	public MotelCleaning() {
		super(time, salary, happinessModifier, healthModifier);
	}

	@Override
	public String getName() {
		return "MotelCleaning";
	}

}
