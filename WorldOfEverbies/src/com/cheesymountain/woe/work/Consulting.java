package com.cheesymountain.woe.work;

public class Consulting extends Work {

	private static String name = "consulting";
	private static int time = 6;
	private static int salary = 400;
	private static int happinessModifier = -3;
	private static int healthModifier = -1;
	
	public Consulting() {
		super(name, time, salary, happinessModifier, healthModifier);
	}

}
