package com.cheesymountain.woe.training;
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
 * This is an abstract class containing information for other classes that 
 * are to be treated as a training session. It has getters and a constructor.
 * 
 * @author Rickard Hallberg
 */
public abstract class Training {
	
	private int strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier, minutesTraining;
	
	/**
	 * This is the constructor that is called for from all subclasses.
	 * 
	 * @param strengthModifier
	 * @param intelligenceModifier
	 * @param staminaModifier
	 * @param fullnessModifier
	 */
	public Training(int strengthModifier, int intelligenceModifier, int staminaModifier, int fullnessModifier, int minutesTraining){
		this.fullnessModifier = fullnessModifier;
		this.intelligenceModifier = intelligenceModifier;
		this.staminaModifier = staminaModifier;
		this.strengthModifier = strengthModifier;
		this.minutesTraining = minutesTraining;
	}
	/**
	 * @return a string with the name of the type of training
	 */
	public abstract String getName();

	/**
	 * @return the strengthmodifier of the given training as an int
	 */
	public int getStrengthModifier(){
		return strengthModifier;
	}
	
	/**
	 * @return the intelligencemodifier of the given training as an int
	 */
	public int getIntelligenceModifier(){
		return intelligenceModifier;
	}
	
	/**
	 * @return the staminamodifier of the given training as an int
	 */
	public int getStaminaModifier(){
		return staminaModifier;
	}
	
	/**
	 * @return the fullnessmodifier of the given training as an int
	 */
	public int getFullnessModifier(){
		return fullnessModifier;
	}
	
	public int getMinutesTraining(){
		return minutesTraining;
	}
}
