package com.cheesymountain.woe.work;
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
 * @author Karl-Agnes
 */
public class SellLemonade extends Work {

	private static int time = 60;
	private static int healthModifier = 0;
	private static int strengthReq = 1, staminaReq = 1, intelligenceReq = 1;
	
	public SellLemonade(int salary) {
		super(time, salary, healthModifier, strengthReq, staminaReq, intelligenceReq);
	}
	
	@Override
	public String getName() {
		return "selllemonade";
	}
}
