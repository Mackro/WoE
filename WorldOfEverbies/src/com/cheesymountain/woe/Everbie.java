package com.cheesymountain.woe;

public class Everbie {

	private String name;
	private int maxHealth, health, strength, intelligence, maxStamina, stamina,
			charm, fullness, happiness, alcoholLevel, cuteness, money;

	public Everbie(String name) {
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
		alcoholLevel = 0;
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

	public int getAlcoholLevel() {
		return alcoholLevel;
	}

	public int getCuteness() {
		return cuteness;
	}
	
	public int getMoney(){
		return money;
	}
	
	public void incrementMaxhealth(int i){
		maxHealth += i;
	}
	
	public void incrementHealth(int i){
		health += i;
	}
	
	public void incrementStrength(int i){
		strength += i;
	}
	
	public void incrementIntelligence(int i){
		intelligence += i;
	}
	
	public void incrementMaxStamina(int i){
		maxStamina += i;
	}
	
	public void incrementStamina(int i){
		stamina += i;
	}
	
	public void incrementCharm(int i){
		charm  += i;
	}
	
	public void incrementFullness(int i){
		fullness += i;
	}
	
	public void incrementHappiness(int i){
		happiness += i;
	}
	
	public void incrementAlocoholLevel(int i){
		alcoholLevel += i;
	}
	
	public void incrementCuteness(int i){
		cuteness += i;
	}
	
	public void incrementMoney(int i){
		money += i;
	}
	
	public void decrementMoney(int i){
		money -= i;
	}
	
	public void sleep(){
		health = maxHealth;
		stamina = maxStamina;
		alcoholLevel = 0;
	}

}
