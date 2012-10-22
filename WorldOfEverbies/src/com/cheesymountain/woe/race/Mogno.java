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
 * A representation of the Mogno race.
 * Contains all the variables representing the starting values of the Mogno race.
 *  @author Emil Åhsberg
 *  @author Karl-Agnes
 *
 */

public class Mogno extends Race {
	public Mogno(){
		name = "Mogno";
		description = "Mogno:\nThe mognos are known for their sharp claws and short temper.";
		imageIdMin = R.drawable.mognomin;
		imageIdMed = R.drawable.mognomed;
		imageIdMax = R.drawable.mognomax;
		maxHealthModifier = 20;
		strength = 3;
		intelligence = 1;
		stamina  = 2;
		charm = 1;
		cuteness = 1;
	}
}
