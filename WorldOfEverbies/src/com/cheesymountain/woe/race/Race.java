package com.cheesymountain.woe.race;
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

import com.cheesymountain.woe.R;

public abstract class Race {
	
	protected String raceName = "Eibreve";
	protected String description = "The plain Everbie without any boost, not choosable at the moment";
	protected int imageIdMin = R.drawable.mognomin;
	protected int imageIdMed = R.drawable.mognomin;
	protected int imageIdMax = R.drawable.mognomin;
	protected int maxHealthModifier = 20, strength = 1, intelligence = 1, stamina  = 1,
			charm = 1, cuteness = 1;
	public static final Race[] RACELIST = {new Mogno(), new Rokash(), new Skrom(), new Tragani()};

	public String getName() {
		return raceName;
	}
	public String getDescription() {
		return description;
	}
	public int getImageIdMin() {
		return imageIdMin;
	}
	public int getImageIdMed(){
		return imageIdMed;
	}
	public int getImageIdMax(){
		return imageIdMax;
	}
	public int getMaxHealthModifier() {
		return maxHealthModifier;
	}
	public int getStrength() {
		return strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getStamina() {
		return stamina;
	}
	public int getCharm() {
		return charm;
	}
	public int getCuteness() {
		return cuteness;
	}
}