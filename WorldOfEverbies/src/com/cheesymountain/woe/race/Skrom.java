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
 * A representation of the Skrom race.
 * Contains all the variables representing the starting values of the Skrom race.
 * @author Emil �hsberg
 * @author Karl-Agnes 
 *
 */

public class Skrom extends Race{
	public Skrom(){
		raceName = "Skrom";
		description = "Skrom:\nThe most intelligent race among the Everbies" +
				" are the Skrom but their constant studying have resulted in severely degenerated hygiene.";
		imageIdMin = R.drawable.skrommin;
		imageIdMed = R.drawable.skrommed;
		imageIdMax = R.drawable.skrommax;
		maxHealthModifier = 20;
		strength = 1;
		stamina = 1;
		intelligence = 3;
		charm = 3;
		cuteness = 1;
	}
}