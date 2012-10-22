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

/**
 * A representation of the Rokash race.
 * Contains all the variables representing the starting values of the Rokash race.
 * @author Emil Åhsberg
 * @author Karl-Agnes
 *
 */

public class Rokash extends Race {	
	public Rokash(){
		raceName = "Rokash";
		description = "Rokash:\nThe Rokash race is the proudest race of them all, though they are not at all concerned to be modest about it. They also have decent stamina.";
		imageIdMin = R.drawable.rokashmin;
		imageIdMed = R.drawable.rokashmed;
		imageIdMax = R.drawable.rokashmax;
		maxHealthModifier = 20;
		strength = 1;
		stamina  = 2;
		intelligence = 1;
		charm = 3;
		cuteness = -5;
	}
}
