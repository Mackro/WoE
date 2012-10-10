package com.cheesymountain.woe.item;
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
 * Class representing a Book item that extends Item class. Calls super from
 * constructor and relevant setters in Item. Overrides getName in Item.
 */

public class Book extends Item {

	public Book() {
		super(1, 250);
		setIntelligenceModifier(2);
		setCharmModifier(1);
	}

	@Override
	public String getName() {
		return "Book";
	}

	@Override
	public int getImageID() {
		return R.drawable.ic_launcher;
	}

}
