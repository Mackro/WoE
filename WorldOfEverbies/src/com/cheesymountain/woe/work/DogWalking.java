package com.cheesymountain.woe.work;

public class DogWalking extends Work {

	private static String name = "Dogwalking";
	private static int time = 1;
	private static int salary = 5;
	private static int happinessModifier = -5;
	private static int healthModifier = 2;
	
	public DogWalking() {
		super(name, time, salary, happinessModifier, healthModifier);
	}

}
