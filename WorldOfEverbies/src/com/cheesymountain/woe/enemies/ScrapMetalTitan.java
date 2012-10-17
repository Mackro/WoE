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


import com.cheesymountain.woe.item.*;

public class ScrapMetalTitan extends Enemy {
	
	private static final String NAME = "Scrapmetal titan";
	private static int HEALTH = 70;
	private static int STRENGTH = 14;
	private static int STAMINA = 14;
	private static int INTELLIGENCE = 8;
	private static int BASEMONEYREWARD = 40;
	
	public ScrapMetalTitan(){
		super(NAME, HEALTH, STRENGTH, STAMINA, INTELLIGENCE, BASEMONEYREWARD);
		super.setAdditionalItemReward(new Kettlebell());
	}
}