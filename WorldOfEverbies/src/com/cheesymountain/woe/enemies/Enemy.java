package com.cheesymountain.woe.enemies;
/*=============================================================
 * Copyright 2012, Cheesy Mountain Production
 * 
 * This file is part of World of Everbies.
 * 
 * World of Everbies is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * World of Everbies is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with World of Everbies.  If not, see <http://www.gnu.org/licenses/>.
================================================================*/


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
