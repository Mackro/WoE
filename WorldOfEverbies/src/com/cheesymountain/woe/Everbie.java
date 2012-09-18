package com.cheesymountain.woe;

public class Everbie {

	private String name;
	private int maxHealth, health, strength, intelligence, maxStamina, stamina,
			charm, fullness, happiness, toxicity, cuteness, money;
	private boolean isAlive;

	public Everbie(String name) {
		isAlive = true;
		this.name = name;
		maxHealth = 1;
		health = 1;
		strength = 1;
		intelligence = 1;
		maxStamina = 1;
		stamina = 1;
		charm = 1;
		fullness = 50;
		happiness = 50;
		toxicity = 0;
		cuteness = 1;
		money = 100;
	}

	public String GetName() {
		return name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getHealth() {
		return health;
	}

	public int getstrength() {
		return strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getMaxStamina() {
		return maxStamina;
	}

	public int getStamina() {
		return stamina;
	}

	public int getCharm() {
		return charm;
	}

	public int getFullness() {
		return fullness;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getToxicity() {
		return toxicity;
	}

	public int getCuteness() {
		return cuteness;
	}

	public int getMoney() {
		return money;
	}

	public void changeMaxhealth(int i) {
		maxHealth += i;
	}

	public void changeHealth(int i) {
		if (health + i < maxHealth) {
			health += i;
		} else if (health + i > maxHealth) {
			health = maxHealth;
		} else if (health + i < 1) {
			health = 0;
			isAlive = false;
		}
	}

	public void changeStrength(int i) {
		strength += i;
	}

	public void changeIntelligence(int i) {
		intelligence += i;
	}

	public void changeMaxStamina(int i) {
		maxStamina += i;
	}

	public void changeStamina(int i) {
		if (stamina + i < maxStamina) {
			stamina += i;
		} else if (stamina + i > maxStamina) {
			stamina = maxStamina;
		} else if (stamina + i < 1) {
			stamina = 0;
		}
	}

	public void changeCharm(int i) {
		charm += i;
	}

	public void changeFullness(int i) {
		fullness += i;
	}

	public void changeHappiness(int i) {
		happiness += i;
	}

	public void changeToxicity(int i){
		if(){
		toxicity += i;
		}
	}

	public void changeCuteness(int i) {
		cuteness += i;
	}

	public void changeMoney(int i) {
		money += i;
	}

	public void sleep() {
		health = maxHealth;
		stamina = maxStamina;
		toxicity = 0;
	}

	public void eat(Food food) {
		money -= food.getCost();
		fullness += food.getFullnessModifier();
		happiness += food.getHappinessModifier();
	}

}
