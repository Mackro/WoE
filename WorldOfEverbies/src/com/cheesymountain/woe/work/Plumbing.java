package com.cheesymountain.woe.work;
/**
 * @author Karl-Agnes
 */
public class Plumbing extends Work {

	private static int time = 3;
	private static int salary = 40;
	private static int happinessModifier = -5;
	private static int healthModifier = 0;
	
	public Plumbing() {
		super(time, salary, happinessModifier, healthModifier);
	}

	@Override
	public String getName() {
		return "Plumbing";
	}

}
