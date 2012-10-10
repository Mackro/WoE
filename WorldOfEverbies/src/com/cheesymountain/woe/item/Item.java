package com.cheesymountain.woe.item;
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

/**
 * Abstract class extended by all classes that are to be treated as items in the
 * game containing getters for variables, protected setters for variables that
 * aren't used by all classes extended the Item class and a abstract method for
 * the name variable.
 * 
 */

public abstract class Item {

	private int cost;
	private int healthModifier;
	private int strengthModifier;
	private int intelligenceModifier;
	private int staminaModifier;
	private int charmModifier;
	private int happinessModifier;
	private int cutenessModifier;
	private int toxicityModifier;

	public Item(int happinessModifier, int cost) {
		this.happinessModifier = happinessModifier;
		this.cost = cost;
		healthModifier = 0;
		strengthModifier = 0;
		intelligenceModifier = 0;
		staminaModifier = 0;
		charmModifier = 0;
		cutenessModifier = 0;
		toxicityModifier = 0;

	}

	/**
	 * 
	 * @returns returns the value by which the everbie's happiness is modified.
	 */

	public int getHappinessModifier() {
		return happinessModifier;
	}

	/**
	 * 
	 * @return returns the cost of the item.
	 */

	public int getCost() {
		return cost;
	}

	/**
	 * 
	 * @returns returns the value by which the everbie's health is modified.
	 */

	public int getHealthModifier() {
		return healthModifier;
	}

	/**
	 * 
	 * @returns returns the value by which the everbie's strength is modified.
	 */

	public int getStrengthModifier() {
		return strengthModifier;
	}

	/**
	 * 
	 * @returns returns the value by which the everbie's intelligence is
	 *          modified.
	 */

	public int getIntelligenceModifier() {
		return intelligenceModifier;
	}

	/**
	 * 
	 * @returns returns the value by which the everbie's stamina is modified.
	 */

	public int getStaminaModifier() {
		return staminaModifier;
	}

	/**
	 * 
	 * @returns returns the value by which the everbie's charm is modified.
	 */

	public int getCharmModifier() {
		return charmModifier;
	}

	/**
	 * 
	 * @returns returns the value by which the everbie's cuteness is modified.
	 */

	public int getCutenessModifier() {
		return cutenessModifier;
	}

	/**
	 * 
	 * @return returns the value by which the everbie's cuteness is modified.
	 */

	public int getToxicityModifier() {
		return toxicityModifier;
	}

	/**
	 * 
	 * @return returns the name of the item represented by extending class.
	 */

	public abstract String getName();

	/**
	 * 
	 * @return - returns the id of the image corresponding to the item.
	 */

	public abstract int getImageID();

	/**
	 * 
	 * @param healthModifier
	 *            - represents how the value is altered.
	 */

	protected void setHealthModifer(int healthModifier) {
		this.healthModifier = healthModifier;
	}

	/**
	 * 
	 * @param strengthModifier
	 *            - represents how the value is altered.
	 */

	protected void setStrengthModifier(int strengthModifier) {
		this.strengthModifier = strengthModifier;
	}

	/**
	 * 
	 * @param intelligenceModifier
	 *            - represents how the value is altered.
	 */

	protected void setIntelligenceModifier(int intelligenceModifier) {
		this.intelligenceModifier = intelligenceModifier;
	}

	/**
	 * 
	 * @param staminaModifier
	 *            - represents how the value is altered.
	 */

	protected void setStaminaModifier(int staminaModifier) {
		this.staminaModifier = staminaModifier;
	}

	/**
	 * 
	 * @param charmModifier
	 *            - represents how the value is altered.
	 */

	protected void setCharmModifier(int charmModifier) {
		this.charmModifier = charmModifier;
	}

	/**
	 * 
	 * @param cutenessModifier
	 *            - represents how the value is altered.
	 */

	protected void setCutenessModifier(int cutenessModifier) {
		this.cutenessModifier = cutenessModifier;
	}

	/**
	 * 
	 * @param toxicityModifier
	 *            -represents how the value is altered.
	 */

	protected void setToxicityModifier(int toxicityModifier) {
		this.toxicityModifier = toxicityModifier;
	}

}
