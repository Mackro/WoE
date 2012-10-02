package com.cheesymountain.woe.work;

/**
 * The abstract class to be extended by all classes that
 * are to be treated as works. It contains getters and the
 * constructor to be used.
 * 
 * @author Karl-Agnes
 * 
 */
public abstract class Work {

	private int time, salary, happinessModifier, healthModifier;
	
	public Work(int time, int salary, int happinessModifier, int healthModifier){
		this.time = time;
		this.salary = salary;
		this.happinessModifier = happinessModifier;
		this.healthModifier = healthModifier;
	}
	
	/**
	 * @return the name of the task
	 */
	public abstract String getName();
	
	/**
	 * @return the time it takes to complete the task
	 */
	public int getTime(){
		return time;
	}
	
	/**
	 * @return the amount of money generated by the task
	 */
	public int getSalary(){
		return salary;
	}
	
	/**
	 * @return the modifier for the Everbies happiness
	 */
	public int getHappinessModifier(){
		return happinessModifier;
	}
	
	/**
	 * @return the modifier for the Everbies health
	 */
	public int getHealthModifier(){
		return healthModifier;
	}
}