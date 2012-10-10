package com.cheesymountain.woe.work;

/**
 * @author Karl-Agnes
 */
public class Consulting extends Work {

	private static int time = 6;
	private static int salary = 400;
	private static int happinessModifier = -3;
	private static int healthModifier = -1;
	private static int minutesWorking = 180;
	
	public Consulting() {
		super(time, salary, happinessModifier, healthModifier, minutesWorking);
	}

	@Override
	public String getName() {
		return "consulting";
	}

}
