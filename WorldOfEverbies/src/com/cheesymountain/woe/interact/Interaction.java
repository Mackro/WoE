package com.cheesymountain.woe.interact;
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
 * Abstract class that describes the different interactions available in WoE.
 * 
 * @author Markus Otterberg
 *
 */
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
