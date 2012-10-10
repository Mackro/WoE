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
 * @author Rickard Hallberg
 */
public class Running extends Training {
	
	private static String name = "running";
	private static int strengthModifier = 0;
	private static int staminaModifier = 2;
	private static int intelligenceModifier = 0;
	private static int fullnessModifier = -2;
	private static int minutesTraining = 45;

	public Running() {
		
		super(strengthModifier, intelligenceModifier, staminaModifier, fullnessModifier, minutesTraining);
		
	}

	@Override
	public String getName() {
		return name;
	}

}
