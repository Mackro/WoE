package com.cheesymountain.woe;
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
 * A static class containing information about the different races in WoE
 * @author Markus Otterberg
 *
 */
public class RaceDescription {

	/**
	 * The id of the different Everbie images
	 */
	public static int[] IMAGE_ID = {
		R.drawable.mogno,
		R.drawable.rokash,
		R.drawable.tragani,
		R.drawable.skrom,
	};
	//Will be removed if there is time to implement a more intuitive way to show that
	//the user can swipe across the screen
	public static String SWIPE_DESCRIPTION = "\n\n<swipe left/right to switch race>";
	/**
	 * The descriptions to the different Everbie images
	 */
	public static String[] IMAGE_DESCRIPTION = {
		"Mogno:\nThe Mogno race are known for their sharp claws and short temper.",
		"Rokash:\nThe Rokash race are known for beeing much cuter than the other races but also more hostile.",
		"Tragani:\nThe Tragani race are the fastest of all Everbies but lack intellegence to assess situations correcly.",
		"Skrom:\nThe Skrom race are known for their sharp intelect and oversized belly.",
	};
	
}
