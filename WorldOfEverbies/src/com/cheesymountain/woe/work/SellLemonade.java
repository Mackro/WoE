package com.cheesymountain.woe.work;
/**
 * @author Karl-Agnes
 */
public class SellLemonade extends Work {

	private static int time = 2;
	private static int salary = 10;
	private static int happinessModifier = -8;
	private static int healthModifier = 0;

	public SellLemonade() {
		super(time, salary, happinessModifier, healthModifier);
	}
	
	@Override
	public String getName() {
		return "SellLemonade";
	}

}
