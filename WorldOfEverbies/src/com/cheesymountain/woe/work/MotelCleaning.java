package com.cheesymountain.woe.work;
/**
 * @author Karl-Agnes
 */
public class MotelCleaning extends Work {

	private static int time = 5;
	private static int salary = 60;
	private static int happinessModifier = -15;
	private static int healthModifier = -2;
	private static int minutesWorking = 90; 
	
	public MotelCleaning() {
		super(time, salary, happinessModifier, healthModifier, minutesWorking);
	}

	@Override
	public String getName() {
		return "MotelCleaning";
	}

}
