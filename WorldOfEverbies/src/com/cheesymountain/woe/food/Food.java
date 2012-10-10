package com.cheesymountain.woe.food;
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
