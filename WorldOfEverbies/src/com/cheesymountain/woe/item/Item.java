package com.cheesymountain.woe.item;

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
