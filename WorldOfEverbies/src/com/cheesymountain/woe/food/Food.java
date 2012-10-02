package com.cheesymountain.woe.food;
/**
 * Abstract class that describes the different meals available in WoE.
 * 
 * @author Emil Åhsberg
 *
 */
public abstract class Food {
	
	private int cost;
	private int fullnessModifier, happinessModifier, toxicityModifier;
	
	public Food(int cost, int fullnessModifier, int happinessModifier, int toxicityModifier){
		this.cost = cost;
		this.fullnessModifier = fullnessModifier;
		this.happinessModifier = happinessModifier;
		this.toxicityModifier = toxicityModifier;
	}
	
	/**
	 * Returns the name of the meal
	 * @return this meals name
	 */
	public abstract String getName();
	
	/**
	 * Returns the cost of the meal
	 * @return this meals cost
	 */
	public int getCost(){
		return cost;
	}
	
	/**
	 * Returns the value of how much the fullness level is affected
	 * @return the value to de-/increase by
	 */
	public int getFullnessModifier(){
		return fullnessModifier;
	}
	
	/**
	 * Returns the value of how much the happiness level is affected
	 * @return the value to de-/increase by
	 */
	public int getHappinessModifier(){
		return happinessModifier;
	}
	
	/**
	 * Returns the value of how much the toxicity level is affected
	 * @return the value to de-/increase by
	 */
	public int getToxicityModifier(){
		return toxicityModifier;
	}

}
