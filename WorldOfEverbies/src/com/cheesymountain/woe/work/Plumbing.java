package com.cheesymountain.woe.work;
/**
 * @author Karl-Agnes
 */
public class Plumbing extends Work {

	private static int time = 3;
	private static int salary = 220;
	private static int happinessModifier = -5;
	private static int healthModifier = 0;
	private static int minutesWorking = 120;
	
	public Plumbing() {
		super(time, salary, happinessModifier, healthModifier,minutesWorking);
	}

	@Override
	public String getName() {
		return "Plumbing";
	}

}
