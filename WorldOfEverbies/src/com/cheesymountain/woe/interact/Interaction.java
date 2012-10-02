package com.cheesymountain.woe.interact;

public abstract class Interaction {
	private int happinessModifier;
	private int charmModifier;
	private int cutenessModifer;
	
	public Interaction(int happinessModifier){
		this.happinessModifier = happinessModifier;
		this.charmModifier = 0;
		this.cutenessModifer = 0;
	}
	
	/**
	 * Sets the modifier for the charm attribute
	 * @param charmModifier - the value to change with, default is 0
	 */
	protected void setCharmMod(int charmModifier){
		this.charmModifier = charmModifier;
	}
	
	/**
	 * Sets the modifier for the cuteness attribute
	 * @param cutenessModifier - the value to change with, default is 0
	 */
	protected void setCutenessMod(int cutenessModifier) {
		this.cutenessModifer = cutenessModifier;
	}
	
	/**
	 * Returns the happiness modifier
	 * @return the value to de-/increase happiness by
	 */
	public int getHappinessModifier(){
		return this.happinessModifier;
	}
	
	/**
	 * Returns the charm modifier
	 * @return the value to de-/increase charm by
	 */
	public int getCharmModifier(){
		return this.charmModifier;
	}
	
	/**
	 * Returns the cuteness modifier
	 * @return the value to de-/increase cuteness by
	 */
	public int getCutenessModifier(){
		return this.cutenessModifer;
	}
	
	/**
	 * Returns the name of the current interaction
	 * @return the name of this interaction
	 */
	public abstract String getName();
}
