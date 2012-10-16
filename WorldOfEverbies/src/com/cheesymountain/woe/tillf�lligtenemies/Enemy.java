package com.cheesymountain.woe.tillfälligtenemies;

import com.cheesymountain.woe.item.Item;

public abstract class Enemy {
	
	private String name;
	private int health;
	private int strength;
	private int stamina;
	private int intelligence;
	private int baseMoneyReward;
	private Item additionalItemReward;
	
	public Enemy(String name, int health, int strength, int stamina, int intelligence, int baseMoneyReward){
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.stamina = stamina;
		this.intelligence = intelligence;
		this.baseMoneyReward = baseMoneyReward;
	}
	
	public String getName(){
		return name;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getStamina(){
		return stamina;
	}
	
	public int getIntelligence(){
		return intelligence;
	}
	
	public int getBaseMoneyReward(){
		return baseMoneyReward;
	}
	
	public Item getAdditionalItemReward(){
		return additionalItemReward;
	}

	public void changeHealth(int healthModifier){
		health -= healthModifier; 
	}

	public void setAdditionalItemReward(Item item) {
		additionalItemReward = item;
	}

}
