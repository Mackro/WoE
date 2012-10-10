package com.cheesymountain.woe.work;

import com.cheesymountain.woe.Everbie;

/**
 * @author Karl-Agnes
 */
public class SellLemonade extends Work {

	private static int time = 2;
	private static int salary = (int) ((Everbie.getEverbie().getCharm() + Everbie.getEverbie().getCuteness()+ 
											(Everbie.getEverbie().getIntelligence()/2))*(Math.random()) + 42 + 8); //HHGTTG
	private static int happinessModifier = -8;
	private static int healthModifier = 0;
	private static int minutesWorking = 60;
	
	public SellLemonade() {
		super(time, salary, happinessModifier, healthModifier, minutesWorking);
	}
	
	@Override
	public String getName() {
		return "SellLemonade";
	}

}
