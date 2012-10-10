package com.cheesymountain.woe.work;

/**
 * @author Karl-Agnes
 */
public class DogWalking extends Work {

	private static int time = 1;
	private static int salary = 40;
	private static int happinessModifier = -5;
	private static int healthModifier = 2;
	private static int minutesWorking = 30;
	
	public DogWalking() {
		super(time, salary, happinessModifier, healthModifier, minutesWorking);
	}

	@Override
	public String getName() {
		return "Dogwalking";
	}

}
