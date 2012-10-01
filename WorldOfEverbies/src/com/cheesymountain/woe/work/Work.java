package com.cheesymountain.woe.work;

public abstract class Work {

	private String name;
	private int time, salary;
	private int happinessModifier, healthModifier;
	
	public Work(String name, int time, int salary, int happinessModifier, int healthModifier){
		this.name = name;
		this.time = time;
		this.salary = salary;
		this.happinessModifier = happinessModifier;
		this.healthModifier = healthModifier;
	}
	
	public String getName(){
		return name;
	}
	
	public int getTime(){
		return time;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public int getHappinessModifier(){
		return happinessModifier;
	}
	
	public int getHealthModifier(){
		return healthModifier;
	}
}
